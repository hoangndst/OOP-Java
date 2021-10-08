package com.example.week5;

public class Circle {
    private double radius;
    private String color;

    /**
     * Constructor 1.
     */

    public Circle() {
        this.radius = 1.0;
        this.color = "red";
    }

    /**
     * Constructor 2.
     * @param radius radius of the circle.
     */

    public Circle(double radius) {
        this.radius = radius;
        this.color = "red";
    }

    /**
     * Constructor 3.
     * @param radius radius of the circle.
     * @param color color of the circle.
     */

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    /**
     * Getter for radius.
     * @return radius of the circle.
     */

    public double getRadius() {
        return radius;
    }

    /**
     * Setter for radius.
     * @param radius radius of the circle.
     */

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Getter for color.
     * @return color of the circle.
     */

    public String getColor() {
        return color;
    }

    /**
     * Setter for color.
     * @param color color of the circle.
     */

    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Calculates the area of the circle.
     * @return area of the circle.
     */

    public double getArea() {
        return radius * radius * Math.PI;
    }

    /**
     * Get information about the circle.
     * @return information about the circle.
     */

    public String toString() {
        return "Circle[radius=" + radius + ",color =" + color + "]";
    }
}
