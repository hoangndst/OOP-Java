package com.example.week9;

public class Subtraction extends BinaryExpression {

    /**
     * Constructor for Subtraction.
     * @param left the left expression
     * @param right the right expression
     */

    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Evaluates the subtraction.
     * @return the result of the subtraction
     */

    @Override
    public double evaluate() {
        return left.evaluate() - right.evaluate();
    }

    /**
     * Returns the string representation of the subtraction.
     * @return the string representation of the subtraction
     */

    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }

}
