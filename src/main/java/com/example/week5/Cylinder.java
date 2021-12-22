package com.example.week5;

public class Cylinder extends Circle{
    private double height;
    protected final static double PI = Math.PI;

    /**
     * Constructor 1.
     */

    public Cylinder() {
        super();
        this.height = 1.0;
    }

    /**
     * Constructor 2.
     * @param radius the radius of the circle
     */

    public Cylinder(double radius) {
        super(radius);
        this.height = 1.0;
    }
    /**
     * Constructor 3.
     * @param radius the radius of the circle
     * @param height the height of the cylinder
     */

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    /**
     * Constructor 4.
     * @param radius the radius of the circle
     * @param color the color of the circle
     * @param height the height of the cylinder
     */

    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }

    /**
     * Getter for the height.
     * @return the height of the cylinder
     */

    public double getHeight() {
        return height;
    }

    /**
     * Setter for the height.
     * @param height the height of the cylinder
     */

    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Calculates the volume of the cylinder.
     * @return the volume of the cylinder
     */
    
    public double getVolume() {
        return getArea() * height;
    }

    /**
     * Overrides the toString method.
     */

    @Override
    public String toString() {
        return "Cylinder[Circle[radius="+ getRadius() + ",color=" 
        + getColor() + "],height=" + getHeight() + "]";
    }

    /**
     * Overrides the getArea method.
     */

    @Override
    public double getArea() {
        return PI * getRadius() * getRadius();
    }
}
