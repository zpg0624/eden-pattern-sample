package com.eden.facade;

/**
 * @created by eden
 * @since 2019-03-13 下午 2:06:09
 */

public class ShapeMarker {

    private Shape rectangleShape;

    private Shape circleShape;

    public ShapeMarker(Shape rectangleShape, Shape circleShape) {
        this.rectangleShape = rectangleShape;
        this.circleShape = circleShape;
    }

    public void facadeShape(){
        rectangleShape.draw();
        circleShape.draw();
    }

    public static void main(String[] args) {

        ShapeMarker marker = new ShapeMarker(new RectangleShape(), new CircleShape());

        marker.facadeShape();

    }


}
