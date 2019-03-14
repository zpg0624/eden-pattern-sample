package com.eden.chain;

/**
 * @created by eden
 * @since 2019-03-14 下午 2:20:19
 */

public abstract class AbstractLogger {

    public  static final  int ERROR = 1;

    public static  final int DEBUG  = 2;

    public static final int INFO = 3;

    private int level;

    private AbstractLogger nextLogger;

    public AbstractLogger(int level, AbstractLogger nextLogger) {
        this.level = level;
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level , String message){
        if(this.level>=level){
            write(message);
        }
        if(nextLogger != null)
            nextLogger.logMessage(level,message);
    }


    public abstract void write(String message);
}
