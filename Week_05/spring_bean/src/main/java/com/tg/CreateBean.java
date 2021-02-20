package com.tg;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class CreateBean {
    @Bean
    public Person creatPerson(){
        return new Person();
    }
}
