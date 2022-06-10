package com.personal.solid.openClose.good;

public class Rectangle implements IShape {

    private int heigh;

    private int width;

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int area() {
        return heigh* width;
    }
}
