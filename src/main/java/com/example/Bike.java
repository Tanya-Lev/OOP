package com.example;

public class Bike implements IVehicle {

    public String model;

    Bike(String model) {
        this.model = model;
        System.out.println("--Bike bean was created--");
    }

    @Override
    public void signalOfVehicle() {
        System.out.println("Dingg-dingGggGG");
    }

    @Override
    public void printInfo() {
        System.out.printf("Model: %s\n", model);
    }

    public void init(){
        System.out.println("Class Bike: init method.");
    }

    public void destroy(){

        System.out.println("Class Bike: destroy method.");
    }
}
