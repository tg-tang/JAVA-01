package com.tg;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties
public class Student {

    public void say(){
        System.out.println("say....");
    }
}
