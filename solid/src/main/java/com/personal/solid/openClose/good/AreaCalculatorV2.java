package com.personal.solid.openClose.good;

public class AreaCalculatorV2 {

    public int calcularArea(IShape shape){
        return shape.area();
    }
}
