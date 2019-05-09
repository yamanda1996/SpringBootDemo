package com.yamanda.springbootdemo.message;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MsgListener {

    @JmsListener(destination = "my-destination")
    public void receiveMsg(String msg){
        System.out.println("receive msg " + msg);
    }
}
