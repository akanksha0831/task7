package com.task7.design_patterns.design_patterns;

public class TemplatePatternDemo {
	   public static void main(String[] args) {

	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();		
	   }
	}