package com.eden.bridge;

/**
 * @created by eden
 * @since 2019-03-13 上午 10:12:05
 */

public class Circle extends Shape {

    int x, y;



    protected Circle(DrawAPI drawAPI, int x, int y) {
        super(drawAPI);
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {

        drawAPI.drawCircle(x, y);

    }

    @Override
    void drawFlatShape() {
        drawAPI.drawCircle(x, y);
    }

    public static void main(String[] args) {

        Shape shape = new Circle(new GreenCircle(), 1, 33);
         shape.draw();
        Shape shape1 = new Circle(new RedCircleDraw(), 1, 33);
         shape1.draw();
    }
}
