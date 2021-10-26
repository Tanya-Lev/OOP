package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("employeeBean")
public class Employee {

   @Autowired
   @Qualifier("ravenBean")
   IPet pet;

   @Autowired
   @Qualifier("bikeBean")
   IVehicle vehicle;

   @Value("${employee.name}")
   String name;

   @Value("${employee.age}")
   int age;

   Employee() {
      System.out.println("--Employee bean was created--");
   }

   public IVehicle getVehicle() {
      return vehicle;
   }

   public void setVehicle(IVehicle vehicle) {
      this.vehicle = vehicle;
   }

   public void setPet(IPet pet) {
      this.pet = pet;
   }

    public IPet getPet() {
    return pet;
    }


   public void setName(String name) {
      this.name = name;
   }

   public String getName() {
      return name;
   }

   public void setAge(int age) {
      this.age = age;
   }

   public int getAge() {
      return age;
   }

   public void callYourPet() {

      System.out.println("Ко мне!");

      this.pet.say();
   }

   public void havePet(IPet pet){//завести ещё животное

   }

   //по-бибикать
   public void honk(){
      this.vehicle.signalOfVehicle();
   }

   @PostConstruct
   public void init(){
      System.out.println("Class Employee: init method.");
   }

   @PreDestroy
   public void destroy(){
      System.out.println("Class Employee: destroy method.");
   }
}
