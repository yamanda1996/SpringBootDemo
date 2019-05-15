package com.yamanda.springbootdemo.message;

import com.yamanda.springbootdemo.pojo.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.jms.DefaultJmsListenerContainerFactoryConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.converter.MessageType;
import org.springframework.stereotype.Component;

import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

@Configuration
public class MsgCreator implements CommandLineRunner {

    @Bean
    public JmsListenerContainerFactory<?> myFactory(ConnectionFactory connectionFactory,
                                                    DefaultJmsListenerContainerFactoryConfigurer configurer){
        DefaultJmsListenerContainerFactory containerFactory =
                new DefaultJmsListenerContainerFactory();
        configurer.configure(containerFactory,connectionFactory);
        return containerFactory;
    }

    @Bean
    public MessageConverter messageConverter(){
        MappingJackson2MessageConverter converter =
                new MappingJackson2MessageConverter();
        converter.setTargetType(MessageType.TEXT);
        converter.setTypeIdPropertyName("_type");
        return converter;
    }

    @Autowired
    private JmsTemplate jmsTemplate;

    @Override
    public void run(String... args) throws Exception {
        jmsTemplate.convertAndSend("mail-box",
                new Email("yamanda","yamanda","hello"));
    }
//    @Override
//    public Message createMessage(Session session) throws JMSException {
//        return session.createTextMessage("a new message for testing!!!");
//    }


}
