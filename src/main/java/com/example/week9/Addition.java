package com.example.week9;

public class Addition extends BinaryExpression {

    /**
     * Constructor for the addition class.
     * @param left the left expression
     * @param right the right expression
     */

    public Addition(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * Evaluates the addition expression.
     * @return the result of the addition
     */

    @Override
    public double evaluate() {
        return left.evaluate() + right.evaluate();
    }

    /**
     * Returns the string representation of the addition expression.
     * @return the string representation of the addition expression
     */

    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }

}
