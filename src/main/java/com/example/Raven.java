package com.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("ravenBean")
public class Raven implements IPet {

   Raven(){System.out.println("--Raven bean was created--");}

   @Override
   public void say() {
      System.out.println("Caw-caw :>");
   }

   @PostConstruct
   public void init(){
      System.out.println("Class Raven: init method.");
   }

   @PreDestroy
   public void destroy(){
      System.out.println("Class Raven: destroy method.");
   }

}
