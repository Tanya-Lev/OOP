package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testt {

   public static void main(String[] args) {
      // Cat Fur = new Cat();
      // Fur.say();

      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      IPet pet = context.getBean("myPet", IPet.class);
      pet.say();

      Car car = context.getBean("myCar", Car.class);
      car.printCar();

      System.out.println("----TEST START----");

      Employee emp = context.getBean("myEmployee", Employee.class);
      emp.callYourPet();


      System.out.println(emp.getName());
      System.out.println(emp.getAge());
      emp.car.printCar();
   }
}
