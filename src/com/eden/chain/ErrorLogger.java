package com.eden.chain;

/**
 * @created by eden
 * @since 2019-03-14 下午 2:27:17
 */

public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level, AbstractLogger nextLogger) {
        super(level, nextLogger);
    }

    @Override
    public void write(String msg) {

        System.out.println("error logger"+ msg);
    }
}
