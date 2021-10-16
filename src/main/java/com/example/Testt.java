package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Testt {

    public static void main(String[] args) {
        SpringApplication.run(NetworkRequest.class, args);

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        System.out.println("----TEST START----");

        Employee emp = context.getBean("myEmployee", Employee.class);

        System.out.println("Я " + emp.getName() + ", мне " + emp.getAge() + ".");
        emp.callYourPet();
        emp.vehicle.printInfo();
        emp.honk();

    }

}
