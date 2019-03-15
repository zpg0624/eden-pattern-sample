package com.eden.chain.processchain;

/**
 * 主管审批
 * @created by eden
 * @since 2019-03-15 下午 2:03:15
 */

public class ManagerLoaderProcess extends AbstractProcess {

    public ManagerLoaderProcess(String name) {
        super(name);
    }

    @Override
    protected void process(Content content) {
        if(content.getCount()< 10){
            System.out.println("主管审批，姓名："+content.getName()+", 天数："+content.getCount()+", 描述："+content.getDesc());
        }else if(this.getNextProcess()!=null){
            this.getNextProcess().process(content);
        }

    }
}
