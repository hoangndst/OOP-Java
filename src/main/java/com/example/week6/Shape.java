package com.example.week6;

public abstract class Shape {
    protected String color;
    protected boolean filled;

    /**
     * Constructor 1.
     */

    public Shape() {    
        color = "null";
        filled = false;
    }

    /**
     * Constructor 2.
     * @param color color of the shape.
     * @param filled filled or not.
     */

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    /**
     * Getter for color.
     * @return color of the shape.
     */

    public String getColor() {
        return color;
    }

    /**
     * Setter for color.
     * @param color color of the shape.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Getter for filled.
     * @return filled or not.
     */

    public boolean isFilled() {
        return filled;
    }

    /**
     * Setter for filled.
     * @param filled filled or not.
     */

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    /**
     * Abstract method for area.
     * @return area of the shape.
     */

    public abstract double getArea();

    /**
     * Abstract method for perimeter.
     * @return perimeter of the shape.
     */

    public abstract double getPerimeter();

    /**
     * String representation of the shape.
     * @return string representation of the shape.
     */

    public String toString() {
        return "Shape[color=" + color + ",filled=" + filled + "]";
    }
}

