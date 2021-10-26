package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("bikeBean")
@Scope("prototype")
public class Bike implements IVehicle {

    public String model;

    Bike(@Value("Турист") String model) {
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

    @PostConstruct
    public void init() {
        System.out.println("Class Bike: init method.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Class Bike: destroy method.");
    }
}
