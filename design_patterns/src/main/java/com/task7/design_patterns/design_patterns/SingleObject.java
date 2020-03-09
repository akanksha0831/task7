package com.task7.design_patterns.design_patterns;

public class SingleObject {

	   private static SingleObject instance = new SingleObject();

	   private SingleObject(){}

	   public static SingleObject getInstance(){
	      return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello World!");
	      System.out.println("Singleton Pattern");
	   }
}