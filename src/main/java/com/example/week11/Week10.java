package com.example.week11;

import java.util.ArrayList;
import java.util.List;

public class Week10 {

    private String packages = "";
    private ArrayList<String> libraries = new ArrayList<String>();
    private ArrayList<String> classes = new ArrayList<String>();
    private ArrayList<String> staticMethods = new ArrayList<String>();

    /**
     * Handles the package.
     * @param line the line to be handled
     */

    private void handlePackage(String line) {
        String[] list = line.trim().split(" ");
        packages = list[list.length - 1].replace(";", "");
    }

    /**
     * Handles the library.
     * @param line the line to be handled
     */

    private void handleLibraries(String line) {
        String[] list = line.trim().split(" ");
        libraries.add(list[list.length - 1].replace(";", ""));
    }

    /**
     * Handles the class.
     * @param line the line to be handled
     */

    private void handleClass(String line) {
        int index = line.indexOf("class ") + 6;
        int index2 = line.indexOf(" ", index);
        if (index2 == -1) {
            return;
        }
        String className = line.substring(index, index2).trim();
        String[] string = className.split("<");
        classes.add(packages + "." + string[0]);
    }

    /**
     * Handles the parameters.
     * @param str the string to be handled
     * @return the fixed string
     */

    private String handleParameters(String str) {
        if (str.contains("...")) {
            return fixLibrariesString(str.replace("...", ""));
        }
        if (str.contains("[]")) {
            int index = str.indexOf("[]");
            return fixLibrariesString(str.replace("[]", "")) + str.substring(index);
        }
        if (!str.contains("<")) {
            return fixLibrariesString(str);
        }
        int index = str.indexOf("<");
        String fix = fixLibrariesString(str.substring(0, index)) + "<";
        String[] list = str.substring(index + 1, str.length() - 1).split(", ");
        for (int i = 0; i < list.length; i++) {
            if (i != 0) {
                fix = fix.concat(",");
            }
            if (list[i].startsWith("?")) {
                fix = fix.concat(list[i]);
            } else {
                fix = fix + fixLibrariesString(list[i]);
            }
        }
        return fix.concat(">");
    }
    
    /**
     * Handles the static method.
     * @param line the line to be handled
     */

    private void handleStaticMethod(String line) {
        if (line.contains("=")) {
            return;
        }
        int index = line.indexOf("(");
        int index2 = line.indexOf(")", index + 1);
        if (index2 == -1 || index == -1) {
            return;
        }
        String methodName = line.substring(line.substring(0, index).lastIndexOf(" ") + 1, index);
        if (index2 - index == 1) {
            staticMethods.add(methodName.concat("()"));
            return;
        }

        String fixMethod = methodName + "(";
        String params = line.substring(index + 1, index2);
        String[] list = params.split(", ");
        for (int i = 0; i < list.length; i++) {
            if (i != 0) {
                fixMethod = fixMethod.concat(",");
            }
            String str = list[i].substring(0, list[i].lastIndexOf(" "))
                .replace("final ", "").trim();
            String param = handleParameters(str);
            fixMethod = fixMethod.concat(param);
        }
        fixMethod = fixMethod.concat(")");
        staticMethods.add(fixMethod);
    }

    /**
     * Fix library name.
     * @param str the string to be fixed
     * @return the fixed string
     */

    private String fixLibrariesString(String str) {
        for (String s : libraries) {
            if (s.endsWith("." + str)) {
                return s;
            }
        }

        for (String s : classes) {
            if (s.endsWith(str)) {
                return s;
            }
        }

        if (str.charAt(0) >= 'A' && str.charAt(0) <= 'Z' && str.length() > 1) {
            return "java.lang." + str;
        }
        return str;
    }

    /**
     * Set file content to be handled.
     * @param fileContent the file content to be handled
     * @return the fixed file content
     */

    private String setFileContentToOneLine(String fileContent) {
        StringBuilder sb = new StringBuilder(fileContent);
        int index = sb.indexOf("(");
        while (index != -1) {
            int index2 = sb.indexOf(")", index);
            for (int i = index2; i > index; i--) {
                if (sb.charAt(i) == '\n') {
                    sb.deleteCharAt(i);
                }
            }
            index = sb.indexOf("(", index + 2);
        }
        return sb.toString();
    }

    /**
     * Remove comments.
     * @param fileContent the file content to be handled
     * @return the fixed file content
     */

    private String removeAllComments(String fileContent) {
        StringBuilder sb = new StringBuilder(fileContent);
        int index = sb.indexOf("//");
        while (index != -1) {
            int index2 = sb.indexOf("\n", index);
            if (index2 == -1) {
                sb.delete(index, sb.length());
                break;
            }
            sb.delete(index, index2);
            index = sb.indexOf("//");
        }

        index = sb.indexOf("/*");
        while (index != -1) {
            int index2 = sb.indexOf("*/", index);
            if (index2 == -1) {
                break;
            }
            sb.delete(index, index2 + 3);
            index = sb.indexOf("/*");
        }
        return sb.toString();
    }

    /**
     * Get all the methods.
     * @param fileContent the file content to be handled
     * @return the list of methods
     */

    public List<String> getAllFunctions(String fileContent) {
        String temp = removeAllComments(setFileContentToOneLine(fileContent));
        String str = temp.replace("{", "{\n");
        String[] lines = str.split("\n");
        List<String> staticCode = new ArrayList<>();
        for (String line : lines) {
            if (line.startsWith("import")) {
                handleLibraries(line);
            } else if (line.startsWith("package")) {
                handlePackage(line);
            } else if (line.contains("class")) {
                handleClass(line);
            } else if (line.contains("static")) {
                staticCode.add(line);
            } else if (line.contains("enum")) {
                handleClass(line.replace("enum", "class"));
            } else if (line.contains("interface")) {
                handleClass(line.replace("interface", "class"));
            }
        }
        for (String method : staticCode) {
            handleStaticMethod(method);
        }
        return staticMethods;
    }
} 