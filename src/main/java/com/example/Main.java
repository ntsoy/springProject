package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class Main {
    public static void main(String[] args) {

<<<<<<< HEAD
        ApplicationContext context;
        context = new FileSystemXmlApplicationContext("C:\\projects\\springProject\\src\\Beans.xml");
=======
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
>>>>>>> d36f0febc2d3ee2ea0656d963b450f5a09ef39b5

        Performer performer = (Performer) context.getBean("kenny2");
        performer.perform();
        System.out.println("Add new out");
    }
}