package com.example.week8;

public class Triangle implements GeometricObject {

    private Point p1;
    private Point p2;
    private Point p3;

    /**
     * Construct a triangle with specified three points.
     * @param p1 the first point
     * @param p2 the second point
     * @param p3 the third point
     */

    public Triangle(Point p1, Point p2, Point p3) throws RuntimeException {
        setPoints(p1, p2, p3);
    }

    /**
     * Get point 1.
     * @return the first point
     */

    public Point getP1() {
        return p1;
    }

    /**
     * Get point 2.
     * @return the second point
     */

    public Point getP2() {
        return p2;
    }

    /**
     * Get point 3.
     * @return the third point
     */

    public Point getP3() {
        return p3;
    }

    /**
     * Get the area of this triangle.
     * @return the area
     */

    public double getArea() {
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - getP1().distance(getP2())) 
        * (s - getP2().distance(getP3())) * (s - getP3().distance(getP1())));
    }

    /**
     * Get the perimeter of this triangle.
     * @return the perimeter
     */

    public double getPerimeter() {
        return getP1().distance(getP2()) + getP2().distance(getP3()) 
        + getP3().distance(getP1());
    }

    /**
     * Get string representation of this triangle.
     * @return the string representation of this triangle
     */
    
    public String getInfo() {
        return String.format("Triangle[(%.2f,%.2f),(%.2f,%.2f),(%.2f,%.2f)]", 
        p1.getPointX(), p1.getPointY(), p2.getPointX(), p2.getPointY(), 
        p3.getPointX(), p3.getPointY());
    }

    /**
     * Set point.
     * @param p1 the first point
     * @param p2 the second point
     * @param p3 the third point
     * @throws RuntimeException if invalid points
     */

    private void setPoints(Point p1, Point p2, Point p3) throws RuntimeException {
        double x1 = p1.getPointX();
        double y1 = p1.getPointY();
        double x2 = p2.getPointX();
        double y2 = p2.getPointY();
        double x3 = p3.getPointX();
        double y3 = p3.getPointY();
        if (p1.equals(p2) || p2.equals(p3) || p3.equals(p1)) {
            throw new RuntimeException("Invalid points");
        } else if ((x3 - x2) * (y1 - y2) - (x1 - x2) * (y3 - y2) == 0) {
            throw new RuntimeException("Invalid points");
        } else {
            this.p1 = p1;
            this.p2 = p2;
            this.p3 = p3;
        }
    }
}
