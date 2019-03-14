package com.eden.mediator;

/**
 * @created by eden
 * @since 2019-03-14 下午 3:53:40
 */

public class User {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void sendMsg(String msg){
        ChatRoom.showMsg(msg);
    }

    public static void main(String[] args) {

        User user = new User();
        user.sendMsg("aa");
    }
}
