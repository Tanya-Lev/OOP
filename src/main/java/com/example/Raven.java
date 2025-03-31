package com.example;

public class Raven implements IPet {

   Raven(){System.out.println("--Raven bean was created--");}

   @Override
   public void say() {
      System.out.println("Caw-caw :>");
   }

   public void init(){
      System.out.println("Class Raven: init method.");
   }

   public void destroy(){
      System.out.println("Class Ravgggen: destroy method.");
   }

}
