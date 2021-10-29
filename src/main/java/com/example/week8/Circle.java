package com.example.week8;

public class Circle implements GeometricObject {

    public static final double PI = 3.14;
    private Point center;
    private double radius;

    /**
     * Construct a circle with a given center and radius.
     * @param center the center of the circle
     * @param radius the radius of the circle
     */

    public Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    /**
     * Get center of the circle.
     * @return the center of the circle
     */

    public Point getCenter() {
        return center;
    }

    /**
     * Set center of the circle.
     * @param center the center of the circle
     */

    public void setCenter(Point center) {
        this.center = center;
    }

    /**
     * Get radius of the circle.
     * @return the radius of the circle
     */

    public double getRadius() {
        return radius;
    }

    /**
     * Set radius of the circle.
     * @param radius the radius of the circle
     */

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Get the area of the circle.
     * @return the area of the circle
     */

    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Get the perimeter of the circle.
     * @return the perimeter of the circle
     */

    public double getPerimeter() {
        return 2 * PI * radius;
    }

    public String getInfo() {
        return String.format("Circle[(%.2f,%.2f),r=%.2f]", 
        center.getPointX(), center.getPointY(), radius);
    }
}
