package com.example;

public class Car {

   String brand;
   String number;

   Car(String brand, String number) {
      this.brand = brand;
      this.number = number;
   }

   public void printCar() {

      System.out.printf("Brand: %s \tNumber: %s\n", brand, number);
   }

}
