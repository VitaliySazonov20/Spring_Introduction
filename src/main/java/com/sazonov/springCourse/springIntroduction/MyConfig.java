package com.sazonov.springCourse.springIntroduction;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:myApp.properties")
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