package com.sazonov.springCourse.springIntroduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat myCat = context.getBean("catBean", Cat.class);
        context.close();
    }
}
