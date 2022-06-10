package com.personal.solid.openClose.good;

public class Triangle implements IShape{

    private int heigh;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    private int width;

    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }

    @Override
    public int area() {
        return (heigh* width)/2;
    }
}
