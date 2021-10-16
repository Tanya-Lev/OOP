package com.example;

import com.example.Lab1_Lev.NetworkRequest;
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

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/about")
    public String about() {
        return "About us.";
    }

    @GetMapping("/options")
    public String options(@RequestParam(value = "name", defaultValue = "Options.") String name) {
        if (name.isEmpty()) name = "not an option";
        return name;
    }
}
