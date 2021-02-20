package com.tg;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest class SpringbootStarterApplicationTests {

    @Autowired
    private Student student;

    @Test
    void contextLoads() {
        student.say();
    }

}
