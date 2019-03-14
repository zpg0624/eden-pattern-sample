package com.eden.proxy;

/**
 * @created by eden
 * @since 2019-03-14 上午 11:14:02
 */

public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {

        System.out.println("real image display...."+fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.println("real image loadFromDisk ="+fileName);

    }


}
