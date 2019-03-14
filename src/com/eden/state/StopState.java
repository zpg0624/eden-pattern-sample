package com.eden.state;

/**
 * @created by eden
 * @since 2019-03-14 下午 4:35:22
 */

public class StopState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("stop state do action......");
        context.setState("stop state");
    }
}
