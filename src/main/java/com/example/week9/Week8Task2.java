package com.example.week9;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Week8Task2 {

    /**
     * Null pointer exception.
     * @throws NullPointerException if the file is not found.
     */

    public void nullPointerEx() throws NullPointerException {
        String str = null;
        System.out.println(str.length());
    }

    /**
     * Array index out of bound exception.
     * @throws ArrayIndexOutOfBoundsException if the index is out of bound.
     */

    public void arrayIndexOutOfBoundsEx() throws ArrayIndexOutOfBoundsException {
        int[] arr = new int[5];
        System.out.println(arr[6]);
    }

    /**
     * Arithmetic exception.
     * @throws ArithmeticException if the division is 0.
     */

    public void arithmeticEx() throws ArithmeticException {
        int a = 1 / 0;
    }

    /**
     * File not found exception.
     * @throws FileNotFoundException if the file is not found.
     */

    public void fileNotFoundEx() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\test.txt");
    }

    /**
     * IO exception.
     * @throws IOException if the file is not found.
     */

    public void ioEx() throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Admin\\Desktop\\test.txt");
    }
    
    /**
     * Test null pointer exception.
     * @return null pointer exception
     */

    public String nullPointerExTest() {
        try {
            nullPointerEx();
        } catch (NullPointerException e) {
            return "Lỗi Null Pointer";
        }
        return "Không có lỗi";
    }

    /**
     * Test array index out of bound exception.
     * @return array index out of bound exception
     */

    public String arrayIndexOutOfBoundsExTest() {
        try {
            arrayIndexOutOfBoundsEx();
        } catch (ArrayIndexOutOfBoundsException e) {
            return "Lỗi Array Index Out of Bounds";
        }
        return "Không có lỗi";
    }

    /**
     * Test arithmetic exception.
     * @return arithmetic exception
     */

    public String arithmeticExTest() {
        try {
            arithmeticEx();
        } catch (ArithmeticException e) {
            return "Lỗi Arithmetic";
        }
        return "Không có lỗi";
    }

    /**
     * Test file not found exception.
     * @return file not found exception
     */

    public String fileNotFoundExTest() {
        try {
            fileNotFoundEx();
        } catch (FileNotFoundException e) {
            return "Lỗi File Not Found";
        }
        return "Không có lỗi";
    }

    /**
     * Test IO exception.
     * @return IO exception
     */

    public String ioExTest() {
        try {
            ioEx();
        } catch (IOException e) {
            return "Lỗi IO";
        }
        return "Không có lỗi";
    }
}
