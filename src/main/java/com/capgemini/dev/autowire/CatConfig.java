package com.capgemini.dev.autowire;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.capgemini.dev.autowire")
//@ComponentScan(basePackages= {"com.capgemini.dev.autowire","com.capgemini.dev.autowireannotaions"})
public class CatConfig {

}
