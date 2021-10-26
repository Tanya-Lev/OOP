package com.example;

public class Car implements IVehicle {

    String brand;
    String number;

    Car(String brand, String number) {
        this.brand = brand;
        this.number = number;
        System.out.println("--Car bean was created--");
    }

    @Override
    public void signalOfVehicle() {
        System.out.println("Beep-Boop!!!!");
    }

    @Override
    public void printInfo() {
        System.out.printf("Brand: %s \tNumber: %s\n", brand, number);
    }

    public void init(){
        System.out.println("Class Car: init method.");
    }

    public void destroy(){
        System.out.println("Class Car: destroy method.");
    }
}
