package com.eden.bridge;

/**
 * @created by eden
 * @since 2019-03-13 上午 10:10:28
 */

public abstract class Shape {

    protected DrawAPI drawAPI;

    protected  Shape(DrawAPI drawAPI){

        this.drawAPI = drawAPI;
    }
    abstract  void draw();

    abstract  void drawFlatShape();

}
