package com.example.week9;

public class Square extends Expression {
    
    private Expression expression;

    /**
     * Constructor for Square.
     * @param expression the expression to be squared.
     */

    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * Evaluates the expression.
     * @return the square of the expression.
     */

    @Override
    public double evaluate() {
        return expression.evaluate() * expression.evaluate();
    }

    /**
     * toString method.
     * @return the expression squared.
     */

    @Override
    public String toString() {
        return "(" + expression.toString() + ") ^ 2";
    }

}
