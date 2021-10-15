package com.example.week6;

import static org.junit.Assert.assertEquals;

public class Test {
    public static void main(String[] args) {
        Point topLeft = new Point(1.25, 2.34);
        Point point = new Point(1.25, 2.34);
        Rectangle rectangle = new Rectangle(topLeft, 3.45, 4.56, "RED", true);
        Rectangle rectangle2 = new Rectangle(point, 3.45, 4.56, "RED", true);
        Circle circle = new Circle(topLeft, 3.5, "BLUE", true);
        Circle circle2 = new Circle(point, 3.5, "BLUE", true);
        Square square = new Square(topLeft, 3.45, "GREEN", true);
        Layer layer = new Layer();
        layer.addShape(square);
        layer.addShape(circle);
        layer.addShape(rectangle);
        layer.addShape(rectangle2);
        layer.addShape(circle2);
        System.err.println(layer.getInfo());
        layer.removeDuplicates();
        // layer.removeCircles();
        System.err.println(layer.getInfo());
        // System.out.println(rectangle.hashCode());
    }
}