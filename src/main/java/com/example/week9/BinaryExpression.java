package com.example.week9;

public abstract class BinaryExpression extends Expression {
    
    protected Expression left;
    protected Expression right;

    /**
     * Constructor for objects of class BinaryExpression.
     * @param left The left expression.
     * @param right The right expression.
     */

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

}
