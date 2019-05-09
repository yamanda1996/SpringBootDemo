package com.yamanda.springbootdemo.configuration;

import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.autoconfigure.web.embedded.TomcatWebServerFactoryCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.ErrorPage;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;


public class MyTomcatConfiguration {

//    @Bean
//    public TomcatServletWebServerFactory tomcatServletWebServerFactory(){
//        TomcatServletWebServerFactory factory =
//                new TomcatServletWebServerFactory();
//        factory.setPort(8000);
//        factory.addErrorPages(new ErrorPage(HttpStatus.NOT_FOUND,
//                "/404.html"));
//
//        return factory;
//    }

}
