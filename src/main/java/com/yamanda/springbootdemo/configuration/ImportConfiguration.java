package com.yamanda.springbootdemo.configuration;

import com.yamanda.springbootdemo.pojo.ImportTest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ImportConfiguration {

    @Bean
    public ImportTest importTest(){
        return new ImportTest(18,"yamanda");
    }
}
