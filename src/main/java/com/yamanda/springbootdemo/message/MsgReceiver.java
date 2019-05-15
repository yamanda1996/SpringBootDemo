package com.yamanda.springbootdemo.message;

import com.yamanda.springbootdemo.pojo.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MsgReceiver {

    @JmsListener(destination = "mail-box",containerFactory = "myFactory")
    public void receiveMsg(Email email){
        System.out.println(email);
    }
}
