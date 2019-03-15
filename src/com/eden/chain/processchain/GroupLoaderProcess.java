package com.eden.chain.processchain;

/**
 * 组长审批
 * @created by eden
 * @since 2019-03-15 下午 2:03:15
 */

public class GroupLoaderProcess extends AbstractProcess {

    public GroupLoaderProcess(String name) {
        super(name);
    }

    @Override
    protected void process(Content content) {

        if(content.getCount()< 3){
            System.out.println("组长审批，姓名："+content.getName()+", 天数："+content.getCount()+", 描述："+content.getDesc());
        }else if(this.getNextProcess()!=null){
            this.getNextProcess().process(content);
        }

    }
}
