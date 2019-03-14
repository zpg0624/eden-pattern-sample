package com.eden.mediator;

import java.time.ZoneId;
import java.util.Date;

/**
 * @created by eden
 * @since 2019-03-14 下午 3:52:52
 */

public class ChatRoom {

    public  static void showMsg(String msg){
        System.out.println(new Date().toInstant().atZone(ZoneId.systemDefault()).toString()+ msg);
    }

}
