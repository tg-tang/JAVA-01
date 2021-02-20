package com.tg;

import com.sun.xml.internal.xsom.parser.AnnotationContext;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@SpringBootTest
class SpringBeanApplicationTests {

    @Test
    void createBean1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Person person = (Person)context.getBean("person");
        person.say();
    }

    @Test
    void createBean2(){
        AnnotationConfigApplicationContext context =
            new AnnotationConfigApplicationContext(CreateBean.class);
        Person person = context.getBean(Person.class);
        person.say();
    }

    @Autowired
    AutoPerson autoPerson;

    @Test
    void createBean3(){
        autoPerson.say();
    }

}
