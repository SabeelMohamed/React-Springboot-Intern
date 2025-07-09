package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("resources.xml");
        
        Students s = (Students) context.getBean("st");
        s.print();

        SpringBoot f = (SpringBoot) context.getBean("intern");
        f.hello("Sabeel");
        Instructor i = (Instructor) context.getBean("i");
        i.abc("tarun");
    }
}
