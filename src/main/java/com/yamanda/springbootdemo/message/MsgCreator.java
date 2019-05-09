package com.yamanda.springbootdemo.message;

import org.springframework.jms.core.MessageCreator;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

public class MsgCreator implements MessageCreator {
    @Override
    public Message createMessage(Session session) throws JMSException {
        return session.createTextMessage("a new message for testing!!!");
    }
}
