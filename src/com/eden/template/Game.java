package com.eden.template;

/**
 * @created by eden
 * @since 2019-03-14 下午 4:55:19
 */

public abstract class Game {

    protected  abstract void init();

    protected  abstract  void start();

    protected  abstract void end();


    public final void play(){
        init();
        start();
        end();
    }

}
