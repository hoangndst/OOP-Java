package com.example.week9;

public class ExpressionTest {

    /**
     *  Main method.
     */

    public static void main(String[] args) {
        Numeral numeral10 = new Numeral(10);
        Numeral numeral3 = new Numeral(3);
        Numeral numeral4 = new Numeral(4);
        Numeral numeral0 = new Numeral(0);
        Square square10 = new Square(numeral10);
        Multiplication multiplication43 = new Multiplication(numeral4, numeral3);
        Subtraction subtraction104 = new Subtraction(square10, numeral3);
        Addition addition104 = new Addition(subtraction104, multiplication43);
        Square square = new Square(addition104);
        Division division = new Division(square, numeral0);
        System.out.println(division.evaluate());
        // System.out.println(square.evaluate());
        // System.out.println(square.toString());
    }

}  
