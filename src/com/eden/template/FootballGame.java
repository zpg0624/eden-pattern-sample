package com.eden.template;

/**
 * @created by eden
 * @since 2019-03-14 下午 4:57:01
 */

public class FootballGame extends Game{
    @Override
    protected void init() {
        System.out.println("football init.....");
    }

    @Override
    protected void start() {
        System.out.println("football start.....");
    }

    @Override
    protected void end() {
        System.out.println("football end.....");
    }

    public static void main(String[] args) {

        Game football = new FootballGame();
        football.play();
    }
}
