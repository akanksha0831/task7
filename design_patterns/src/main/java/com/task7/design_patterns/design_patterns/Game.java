package com.task7.design_patterns.design_patterns;

public abstract class Game {

	   abstract void initialize_Play();
	   abstract void start_Play();
	   abstract void end_Play();

	   public final void play(){
		   initialize_Play();
		   start_Play();
		   end_Play();
	   }
}
