package com.yamanda.springbootdemo;

import com.yamanda.springbootdemo.configuration.HttpEncodingConfiguration;
import com.yamanda.springbootdemo.pojo.HttpEncodingProperty;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootDemoApplicationTests {

    @Autowired
    HttpEncodingConfiguration httpEncodingConfiguration;

    @Test
    public void contextLoads() {
        HttpEncodingProperty property =
                httpEncodingConfiguration.httpEncodingProperty;
        String charsetName = property.getCharset().name();
        boolean forceEncoding = property.getForceEncoding();
        System.out.println(charsetName);
        System.out.println(forceEncoding);
    }

}
