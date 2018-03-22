package com.benny.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    private String message;

    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        HelloWorld helloWorld = applicationContext.getBean("helloWorld", HelloWorld.class);


        System.out.println(helloWorld);
    }

}
