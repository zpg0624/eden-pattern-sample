package com.eden.chain;

/**
 * @created by eden
 * @since 2019-03-14 下午 2:29:12
 */

public class LoggerClient {
    String a = String.valueOf('a');

    public static void main(String[] args) {

        AbstractLogger info = new InfoLogger(AbstractLogger.INFO, null);

        AbstractLogger debug = new DebugLogger(AbstractLogger.DEBUG, info);

        AbstractLogger error = new ErrorLogger(AbstractLogger.ERROR, debug);



        debug.logMessage(AbstractLogger.ERROR, "aaa");

//        info.logMessage(AbstractLogger.ERROR, "aa");
    }
}
