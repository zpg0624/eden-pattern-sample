package com.eden.chain;

/**
 * @created by eden
 * @since 2019-03-14 下午 2:28:15
 */

public class DebugLogger extends AbstractLogger {
    public DebugLogger(int level, AbstractLogger nextLogger) {
        super(level, nextLogger);
    }

    @Override
    public void write(String msg) {
        System.out.println("debug logger"+ msg);
    }
}
