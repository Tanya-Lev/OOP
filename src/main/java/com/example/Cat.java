package com.example;

public class Cat implements IPet {

   Cat(){System.out.println("--Cat bean was created--");}

   @Override
   public void say() {
      System.out.println("MeowwwwWW :з");
   }

   public void init(){
      System.out.println("Class Cat: init method.");
   }

   public void destroy(){
      System.out.println("Class Cat: destroy method.");
   }

}
