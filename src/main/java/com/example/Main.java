package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
        Performer performer = (Performer) context.getBean("hank");
        performer.perform();
        System.out.println("Spring in ation, page 95");

    }
}