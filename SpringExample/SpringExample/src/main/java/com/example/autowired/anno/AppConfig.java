package com.example.autowired.anno;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example.autowired.anno")

public class AppConfig {

}
