package com.sazonov.springCourse.springIntroduction;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
//@ComponentScan("com.sazonov.springCourse.springIntroduction")
    public class MyConfig {
    @Bean
//    @Scope("prototype")
    public  Pet catBean(){
        return new Cat();
    }
    @Bean
    public Person personBean(){
        return new Person(catBean());
    }
}