package com.example.week8;

import java.util.List;

public class ShapeUtil {
    
    /**
     * Print list of shapes.
     * @param shapes list of shapes
     * @return string representation of shapes
     */

    public String printInfo(List<GeometricObject> shapes) {
        String result = "Circle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Circle) {
                result += shape.getInfo() + "\n";
            }
        }
        result += "Triangle:\n";
        for (GeometricObject shape : shapes) {
            if (shape instanceof Triangle) {
                result += shape.getInfo() + "\n";
            }
        }
        return result;
    }
}
