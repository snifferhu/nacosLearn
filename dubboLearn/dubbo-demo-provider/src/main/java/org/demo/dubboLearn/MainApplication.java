package org.demo.dubboLearn;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class MainApplication {
    public static void main(String[] args) throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainApplication.class);
        context.start();
        System.in.read(); // press any key to exit
    }

    @Configuration
    @EnableDubbo(scanBasePackages = "org.apache.dubbo.samples.impl")
    @PropertySource("classpath:/spring/dubbo-provider.properties")
    static class ProviderConfiguration {
    }
}
