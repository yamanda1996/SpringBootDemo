package com.yamanda.springbootdemo.pojo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.nio.charset.Charset;


@ConfigurationProperties(prefix = "spring.http.encoding")
public class HttpEncodingProperty {
    //配置的属性需要有默认值
    public static final Charset DEFAULT_CHARSET = Charset.forName("UTF-8");
//    private String encoding;
    private Boolean forceEncoding = true;

    private Charset charset = DEFAULT_CHARSET;

    public Boolean getForceEncoding() {
        return forceEncoding;
    }

    public void setForceEncoding(Boolean forceEncoding) {
        this.forceEncoding = forceEncoding;
    }

    public Charset getCharset() {
        return charset;
    }

    public void setCharset(Charset charset) {
        this.charset = charset;
    }
}
