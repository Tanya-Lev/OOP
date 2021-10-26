package com.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args){

       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Employee employee = context.getBean("employeeBean", Employee.class);

        System.out.println("I`m "+employee.getName()+": "+employee.getAge()+" years old.");


        employee.callYourPet();
        employee.honk();
        employee.vehicle.printInfo();

        context.close();

    }
}
