package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("carBean")
public class Car implements IVehicle {

    String brand;
    String number;

    Car(@Value("BMW") String brand, @Value("45FE-9") String number) {
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

    @PostConstruct
    public void init(){
        System.out.println("Class Car: init method.");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Class Car: destroy method.");
    }
}
