package com.eden.decorator;

/**
 * @created by eden
 * @since 2019-03-13 上午 11:50:24
 */

public class ShapDecorator implements Shape {

    Shape shape;

    public ShapDecorator(Shape shape) {
        this.shape = shape;
    }

    @Override
    public void draw() {
        shape.draw();
        append();
    }

    private void append(){
        System.out.println("append...........");
    }

    public static void main(String[] args) {

        ShapDecorator shapDecorator = new ShapDecorator(new Circle());
        shapDecorator.draw();

        ShapDecorator shapDecorator1 = new ShapDecorator(new Rectangle());
        shapDecorator1.draw();
    }
}
