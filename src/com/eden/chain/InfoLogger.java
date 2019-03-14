package com.eden.chain;

import java.security.MessageDigest;

/**
 * @created by eden
 * @since 2019-03-14 下午 2:26:30
 */

public class InfoLogger extends  AbstractLogger {
    public InfoLogger(int level, AbstractLogger nextLogger) {
        super(level, nextLogger);
    }

    @Override
    public void write(String msg) {
        System.out.println("info logger"+ msg);
    }
}
