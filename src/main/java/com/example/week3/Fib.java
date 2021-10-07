package com.example.week3;

import java.util.Scanner;

public class Fib {
    // Type your main code here
    /**
     * Function finds fibonacci number.
     * @param n number
     * @return fibonacci number
     */

    public long fib(long n) {
        long first = 0;
        long second = 1;
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        for (int i = 1; i < n; i++) {
            second += first;
            first = second - first;
            if (second > Long.MAX_VALUE || second < 0) {
                return Long.MAX_VALUE;
            }
        }
        return second;
    }

    /**
     * Main function.
     * @param args command line arguments
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Fib f = new Fib();
        long n = in.nextLong();
        long result = f.fib(n);
        System.out.println(result);
        in.close();
    }
} 