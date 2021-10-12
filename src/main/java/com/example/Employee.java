package com.example;

public class Employee {

   IPet pet;
   Car car;
   String name;
   int age;

   public void setPet(IPet pet) {
      this.pet = pet;
   }

   // public IPet getPet() {
   // return pet;
   // }

   public void setCar(Car car) {
      this.car = car;
   }

   public Car getCar() {
      return car;
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
}
