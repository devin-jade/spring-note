package com.devin.bean;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonTest {


    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ioc.xml");
        Person person = (Person) context.getBean("person");
        person.print();
    }
}