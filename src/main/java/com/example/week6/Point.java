package com.example.week6;

import java.util.Objects;

public class Point {
    private double pointX;
    private double pointY;

    /**
     * Constructor.
     * @param pointX X coordinate of the point.
     * @param pointY Y coordinate of the point.
     */

    public Point(double pointX, double pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }

    /**
     * Getter for X coordinate of the point.
     * @return X coordinate of the point.
     */

    public double getPointX() {
        return pointX;
    }

    /**
     * Setter for X coordinate of the point.
     * @param pointX X coordinate of the point.
     */

    public void setPointX(double pointX) {
        this.pointX = pointX;
    }

    /**
     * Getter for Y coordinate of the point.
     * @return Y coordinate of the point.
     */

    public double getPointY() {
        return pointY;
    }

    /**
     * Setter for Y coordinate of the point.
     * @param pointY Y coordinate of the point.
     */

    public void setPointY(double pointY) {
        this.pointY = pointY;
    }

    /**
     * Calculates the distance between two points.
     * @param p Point to calculate the distance to.
     * @return Distance between two points.
     */

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.getPointX() - this.getPointX(), 2) 
        + Math.pow(p.getPointY() - this.getPointY(), 2));
    }

    /**
     * Overrides the equals method.
     */

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Point) {
            Point p = (Point) obj;
            return (this.getPointX() == p.getPointX() && this.getPointY() == p.getPointY());
        }
        return false;
    }

    /**
     * Overrides the hashCode method.
     */

    @Override
    public int hashCode() {
        return Objects.hash(this.getPointX(), this.getPointY());
    }

    /**
     * String representation of the point.
     * @return String representation of the point.
     */

    public String toString() {
        return String.format("(%.1f,%.1f)", this.getPointX(), this.getPointY());
    }
}
