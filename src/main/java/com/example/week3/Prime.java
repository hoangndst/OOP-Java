package com.example.week3;
import java.util.Scanner;

public class Prime {
    // Type your main code here

    /**
     * Function check if number is prime.
     * @param n number
     * @return true if number is prime, false otherwise
     */

    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Main function.
     * @param args command line arguments
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Prime solution = new Prime();
        int m = input.nextInt();
        System.out.println(solution.isPrime(m));
        input.close();
    }
} 