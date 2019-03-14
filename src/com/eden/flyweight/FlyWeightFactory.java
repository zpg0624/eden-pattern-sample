package com.eden.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @created by eden
 * @since 2019-03-13 下午 2:30:38
 */

public class FlyWeightFactory {

    private static final Map<String, Shape> cache = new ConcurrentHashMap<>();

    public static Shape getShape(String color){
        CircleShape circle =(CircleShape) cache.get(color);

        if(circle == null) {
            circle = new CircleShape(color);
            cache.put(color, circle);
            System.out.println("Creating  circle of color : " + color);
        }
        return circle;
    }
    private static final String colors[] =
            { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {

        for(int i=0; i < 20; ++i) {
            CircleShape circle =
                    (CircleShape)FlyWeightFactory.getShape(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.draw();
        }
    }
    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
