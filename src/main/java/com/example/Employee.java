package com.example;

public class Employee {

   IPet pet;
   IVehicle vehicle;
   String name;
   int age;

   Employee(){System.out.println("--Employee bean was created--");}

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

   public void honk(){
      this.vehicle.signalOfVehicle();
   }

   public void init(){
      System.out.println("Class Employee: init method.");
   }

   public void destroy(){
      System.out.println("Class Employee: destroy method.");
   }
}
