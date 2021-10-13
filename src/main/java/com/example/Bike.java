package com.example;

public class Bike implements IVehicle{

    public String model;

    Bike (String model) {
        this.model=model;
    }

    @Override
    public void signalOfVehicle() {
        System.out.println("DinggggGggGG");
    }



}
