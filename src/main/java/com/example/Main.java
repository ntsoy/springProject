package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {



        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Performer performer = (Performer) context.getBean("kenny");
        performer.perform();
        System.out.println("Spring in action, page 185");

    }
}