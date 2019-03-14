package com.eden.observer;

/**
 * @created by eden
 * @since 2019-03-14 下午 4:19:26
 */

public class BinaryObserver extends Observer {


    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {

        System.out.println("binary observer update .....");
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new BinaryObserver(subject);

        subject.notifyAllObservers();
    }
}
