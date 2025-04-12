package org.designPrinciple.openClosedPrinciple;

public class Triangle implements Shape {
    public int width=5;
    public int height=6;
    @Override
    public int area() {
       return width*height;
    }
}
