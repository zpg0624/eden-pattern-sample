package com.eden.chain.processchain;

/**
 * @created by eden
 * @since 2019-03-15 下午 1:59:31
 */

public abstract class AbstractProcess {

    private AbstractProcess nextProcess;

    private String name;

    public AbstractProcess(String name) {
        this.name = name;
    }

    public AbstractProcess getNextProcess() {
        return nextProcess;
    }

    public void setNextProcess(AbstractProcess nextProcess) {
        this.nextProcess = nextProcess;
    }

    protected abstract void process(Content content);

}
