package com.example.week8;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor for objects of class Point.
     * @param pointX the x coordinate of the point
     * @param pointY the y coordinate of the point
     */

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Get the x coordinate of the point.
     * @return the x coordinate of the point
     */

    public double getPointX() {
        return pointX;
    }

    /**
     * Set the x coordinate of the point.
     * @param pointX the x coordinate of the point
     */

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Get the y coordinate of the point.
     * @return the y coordinate of the point
     */

    public double getPointY() {
        return pointY;
    }

    /**
     * Set the y coordinate of the point.
     * @param pointY the y coordinate of the point
     */

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Calculate the distance between this point and another point.
     * @param p the other point
     * @return the distance between the two points
     */

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getPointX() - this.getPointX(), 2) 
        + Math.pow(p.getPointY() - this.getPointY(), 2));
    }

    /**
     * Check whether this point is equal to another point.
     * @param otherPoint the other point
     * @return true if the points are equal
     */

    public boolean equals(Point otherPoint) {
        return this.pointX == otherPoint.pointX && this.pointY == otherPoint.pointY;
    }

    /**
     * Get a string representation of the point.
     * @return a string representation of the point
     */

    public String getInfo() {
        return String.format("(%.2f,%.2f)", this.getPointX(), this.getPointY());
    }
}
