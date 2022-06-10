package com.personal.solid.openClose.bad;

import com.personal.solid.openClose.good.Rectangle;
import com.personal.solid.openClose.good.Triangle;

public class AreaCalculator {

    public int calcularArea(Object shape){
        if (shape instanceof Rectangle){
            Rectangle rectangle= (Rectangle) shape;
            return rectangle.getHeigh()* rectangle.getWidth();
        }
        else if (shape instanceof Triangle){
            Triangle triangle= (Triangle) shape;
            return (triangle.getHeigh()* triangle.getWidth())/2;
        }
        return 0;
    }
}
