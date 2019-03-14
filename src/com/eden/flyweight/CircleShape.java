package com.eden.flyweight;

/**
 * @created by eden
 * @since 2019-03-13 下午 2:29:00
 */

public class CircleShape implements Shape {

    private String color;

    private int x, y;

    public CircleShape(String color) {
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void draw() {

        System.out.println("circle shape.....22222....");
    }
}
