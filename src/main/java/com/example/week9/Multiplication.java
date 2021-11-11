package com.example.week9;

public class Multiplication extends BinaryExpression {

    /**
     * Constructor for Multiplication.
     * @param left the left expression
     * @param right the right expression
     */

    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Evaluates the expression.
     * @return the result of the expression
     */

    @Override
    public double evaluate() {
        return left.evaluate() * right.evaluate();
    }

    /**
     * Returns a string representation of the expression.
     * @return the string representation
     */

    @Override
    public String toString() {
        return "(" + left.toString() + " * " + right.toString() + ")";
    }
}
