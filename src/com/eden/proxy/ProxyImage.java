package com.eden.proxy;

/**
 * @created by eden
 * @since 2019-03-14 上午 11:18:49
 */

public class ProxyImage implements Image {

    private Image realImage;

    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
        realImage = new RealImage(fileName);
    }

    @Override
    public void display() {
        realImage.display();
    }

    public static void main(String[] args) {

        Image proxy = new ProxyImage("test.txt");

        proxy.display();
    }
}
