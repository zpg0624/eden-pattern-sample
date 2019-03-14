package com.eden.state;

/**
 * @created by eden
 * @since 2019-03-14 下午 4:34:27
 */

public class StartState implements State {
    @Override
    public void doAction(Context context) {
        System.out.println("start state do action.....");
        context.setState("start state");
    }

    public static void main(String[] args) {

        Context context = new Context();
        State startState = new StartState();
        startState.doAction(context);
        System.out.println(context.getState());

    }
}
