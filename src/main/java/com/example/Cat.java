package com.example;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component("catBean")
public class Cat implements IPet {

   Cat(){System.out.println("--Cat bean was created--");}

   @Override
   public void say() {
      System.out.println("MeowwwwWW :з");
   }

   @PostConstruct
   public void init(){
      System.out.println("Class Cat: init method.");
   }

   @PreDestroy
   public void destroy(){
      System.out.println("Class Cat: destroy method.");
   }

}
