package com.example.week11;

import java.util.regex.Pattern;

import java.util.regex.Matcher;

public class Test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(".*'([^']*)'.*");
        String mydata = "some string with 'the data i want' inside";

        Matcher matcher = pattern.matcher(mydata);
        if(matcher.matches()) {
            System.out.println(matcher.group(1));
        }
    
    }
}
