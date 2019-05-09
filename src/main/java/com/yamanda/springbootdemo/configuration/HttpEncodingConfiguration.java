package com.yamanda.springbootdemo.configuration;

import com.yamanda.springbootdemo.pojo.HttpEncodingProperty;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.filter.OrderedCharacterEncodingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;


//application.properties来注入属性值时需要在Configuration类中写如下注解
@Configuration
@EnableConfigurationProperties(HttpEncodingProperty.class)
@ConditionalOnClass(CharacterEncodingFilter.class)
@ConditionalOnProperty(prefix = "spring.http.encoding",
        value = "enabled",matchIfMissing = true)
public class HttpEncodingConfiguration {


    @Autowired
    public HttpEncodingProperty httpEncodingProperty;

    @Bean
    @ConditionalOnMissingBean(CharacterEncodingFilter.class)
    public CharacterEncodingFilter characterEncodingFilter(){
        CharacterEncodingFilter filter = new OrderedCharacterEncodingFilter();
        filter.setEncoding(httpEncodingProperty.getCharset().name());
        filter.setForceEncoding(httpEncodingProperty.getForceEncoding());
        return filter;
    }

}
