package com.example.week9;

public class Numeral extends Expression {
    
    private double value;

    /**
     * Constructor for objects of class Numeral.
     * @param value the value of the numeral
     */

    public Numeral(double value) {
        this.value = value;
    }

    /**
     * Constructor for objects of class Numeral.
     */

    public Numeral() {

    }

    /**
     * Override the toString method to return the value of the numeral.
     * @return the value of the numeral
     */

    @Override
    public String toString() {
        return String.format("%.0f", value);
    }

    /**
     * Override the evaluate method to return the value of the numeral.
     * @return the value of the numeral
     */

    @Override
    public double evaluate() {
        return value;
    }
}
