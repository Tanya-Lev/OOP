package com.example;

public class Car implements IVehicle{

   String brand;
   String number;

   Car(String brand, String number) {
      this.brand = brand;
      this.number = number;
   }


   public void printCar() {

      System.out.printf("Brand: %s \tNumber: %s\n", brand, number);
   }

   @Override
   public void signalOfVehicle() {
      System.out.println("Beep-Boop!!!!");
   }
}
