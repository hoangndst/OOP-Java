package com.example.week3;

import java.util.Scanner;

public class GCD {

    /**
     * Function finds gcd of two numbers.
     * @param a first number
     * @param b second number
     * @return gcd of two numbers
     */

    public int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        return (b == 0) ? a : gcd(b, a % b);
    }

    /**
     * Main function.
     * @param args command line arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            GCD solution = new GCD();
            System.out.println(solution.gcd(a, b));
        } catch (Exception e) {
            System.out.println(1);
        }
        input.close();
    }
}
