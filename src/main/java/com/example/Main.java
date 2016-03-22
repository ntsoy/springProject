package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new FileSystemXmlApplicationContext
                ("C:\\projects\\springProject\\src\\Beans.xml");

        Performer performer = (Performer) context.getBean("kenny2");
        performer.perform();
    }
}