package com.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testt {

   public static void main(String[] args) {
      // Cat Fur = new Cat();
      // Fur.say();

      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
      IPet pet = context.getBean("myPet", IPet.class);
      pet.say();

      Car car = context.getBean("myVehicle", Car.class);
      car.printCar();

      System.out.println("----TEST START----");

      Employee emp = context.getBean("myEmployee", Employee.class);

      System.out.println("Я "+emp.getName()+", мне "+emp.getAge()+".");
      emp.callYourPet();
      emp.honk();

   }
}
