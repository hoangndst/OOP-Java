package com.example.week3;

public class Solution {
    private int numerator;
    private int denominator;

    /**
     * Constructor 1.
     */

    public Solution() {
        this.numerator = 1;
        this.denominator = 1;
    }

    /**
     * Constructor 2.
     * @param numerator the numerator of the fraction
     * @param denominator the denominator of the fraction
     */

    public Solution(int numerator, int denominator) {
        if (denominator == 0) {
            this.numerator = numerator;
            this.denominator = 1;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
    }

    /**
     * Get the numerator of the fraction.
     * @return the numerator of the fraction
     */

    public int getNumerator() {
        return numerator;
    }

    /**
     * Get the denominator of the fraction.
     * @return the denominator of the fraction
     */

    public int getDenominator() {
        return denominator;
    }

    /**
     * Set the numerator of the fraction.
     * @param numerator the numerator of the fraction
     */

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /**
     * Set the denominator of the fraction.
     * @param denominator the denominator of the fraction
     */

    public void setDenominator(int denominator) {
        if (denominator == 0) {
            denominator = this.denominator;
        }
        this.denominator = denominator;
    }

    /**
     * find the greatest common divisor of two integers.
     * @param a the first integer
     * @param b the second integer
     * @return the greatest common divisor of two integers
     */

    public static int gcd(int a, int b) {
        int minor = Math.min(Math.abs(a), Math.abs(b));
        for (int i = minor; i >= 2; i--) {
            if (a % i == 0 && b % i == 0) {
                return i;
            }
        }
        return 1;
    }

    /**
     * Reduce the fraction to its lowest terms.
     * @return the reduced fraction
     */

    public Solution reduce() {
        int tmp = gcd(this.getNumerator(), this.getDenominator());
        this.setNumerator(this.getNumerator() / tmp);
        this.setDenominator(this.denominator / tmp);
        return this;
    }

    /**
     * Add two fractions.
     * @param fraction the fraction to add
     * @return the sum of the two fractions
     */

    public Solution add(Solution fraction) {
        fraction.reduce();
        int nume = this.numerator * fraction.denominator + fraction.numerator * this.denominator;
        int deno = this.denominator * fraction.denominator;
        return new Solution(nume, deno).reduce();
    }   

    /**
     * Subtract two fractions.
     * @param fraction the fraction to subtract
     * @return the difference of the two fractions
     */

    public Solution subtract(Solution fraction) {
        fraction.reduce();
        int nume = this.numerator * fraction.denominator - fraction.numerator * this.denominator;
        int deno = this.denominator * fraction.denominator;
        return new Solution(nume, deno).reduce();
    }   

    /**
     * Multiply two fractions.
     * @param fraction the fraction to multiply
     * @return the product of the two fractions
     */

    public Solution multiply(Solution fraction) {
        fraction.reduce();
        int numerator = this.numerator * fraction.numerator;
        int denominator = this.denominator * fraction.denominator;
        return new Solution(numerator, denominator).reduce();
    }

    /**
     * Divide two fractions.
     * @param fraction the fraction to divide
     * @return the quotient of the two fractions
     */

    public Solution divide(Solution fraction) {
        fraction.reduce();
        int numerator = this.numerator * fraction.denominator;
        int denominator = this.denominator * fraction.numerator;
        return new Solution(numerator, denominator).reduce();
    }

    /**
     * Check if two fractions are equal.
     * @param obj the obj to compare
     * @return true if the two fractions are equal, false otherwise
     */

    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            other.reduce();
            this.reduce();
            if (other.getNumerator() == this.getNumerator()) {
                return other.getDenominator() == this.getDenominator();
            }
        }
        return false;
    }   
}
