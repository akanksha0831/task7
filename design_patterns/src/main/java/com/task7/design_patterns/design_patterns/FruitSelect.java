package com.task7.design_patterns.design_patterns;

public class FruitSelect{
	   private Fruit apple;
	   private Fruit banana;
	   private Fruit mango;

	   public FruitSelect() {
	      apple = new Apple();
	      banana = new Banana();
	      mango = new Mango();
	   }

	   public void buyApple(){
	      apple.buy();
	   }
	   public void buyBanana(){
	      banana.buy();
	   }
	   public void buyMango(){
	      mango.buy();
	   }
	}