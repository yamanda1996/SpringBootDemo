package com.yamanda.springbootdemo.message;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jms.core.JmsTemplate;

public class MsgReceiver implements CommandLineRunner {

    @Autowired
    JmsTemplate jmsTemplate;

    @Override
    public void run(String... args) throws Exception {
        jmsTemplate.send("my-destination",new MsgCreator());
    }
}
