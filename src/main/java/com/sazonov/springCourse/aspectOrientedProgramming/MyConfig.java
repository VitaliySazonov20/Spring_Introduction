package com.sazonov.springCourse.aspectOrientedProgramming;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.sazonov.springCourse.aspectOrientedProgramming")
@EnableAspectJAutoProxy
    public class MyConfig {
}
