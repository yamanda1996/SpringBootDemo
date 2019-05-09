package com.yamanda.springbootdemo.configuration;

import org.apache.catalina.Context;
import org.apache.catalina.connector.Connector;
import org.apache.tomcat.util.descriptor.web.SecurityCollection;
import org.apache.tomcat.util.descriptor.web.SecurityConstraint;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import sun.security.util.SecurityConstants;

//配置自定义的MvcConfiguration
@Configuration
public class MyMvcConfig extends WebMvcConfigurationSupport {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/index").setViewName("myindex");
        registry.addViewController("/bootstrap").setViewName("bootstrap");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/angular").setViewName("angular");
        registry.addViewController("/login").setViewName("login");
    }

    //自定义WebMvcConfiguration,防止出现静态资源找不到的情况
    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**").
                addResourceLocations("classpath:/static/");
    }


//    public TomcatServletWebServerFactory tomcatServletWebServerFactory(){
//
//    }

//    @Bean
//    public TomcatServletWebServerFactory tomcatServletWebServerFactory(){
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory(){
//            @Override
//            protected void postProcessContext(Context context) {
//                SecurityConstraint securityConstraint = new SecurityConstraint();
//                securityConstraint.setUserConstraint("CONFIDENTIAL");
//                SecurityCollection collection = new SecurityCollection();
//                collection.addPattern("/");
//                securityConstraint.addCollection(collection);
//                context.addConstraint(securityConstraint);
//            }
//        };
//        tomcat.addAdditionalTomcatConnectors(httpConnector());
//        return tomcat;
//    }
//
//
//
//    @Bean
//    public Connector httpConnector(){
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setScheme("http");
//        connector.setPort(8080);
//        connector.setSecure(false);
//        connector.setRedirectPort(8443);
//        return connector;
//    }

}
