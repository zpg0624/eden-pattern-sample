package com.eden.chain.processchain;

import com.eden.chain.AbstractLogger;

/**
 * 老板审批
 * @created by eden
 * @since 2019-03-15 下午 2:03:15
 */

public class BosssProcess extends AbstractProcess {

    public BosssProcess(String name) {
        super(name);
    }

    @Override
    protected void process(Content content) {
        if(content.getCount()< 20){
            System.out.println("老板审批，姓名："+content.getName()+", 天数："+content.getCount()+", 描述："+content.getDesc());
        }else if(this.getNextProcess()!=null){
            this.getNextProcess().process(content);
        }
    }

    public static void main(String[] args) {
        AbstractProcess groupLoader = new GroupLoaderProcess("组长");
        AbstractProcess managerLoader = new ManagerLoaderProcess("主管");
        AbstractProcess bossLoader = new BosssProcess("老板");
        groupLoader.setNextProcess(managerLoader);
        managerLoader.setNextProcess(bossLoader);

        Content content = new Content();
        content.setCount(10);
        content.setName("张三");
        content.setDesc("回家一趟");

        groupLoader.process(content);


    }
}
