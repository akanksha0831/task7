package com.task7.design_patterns.design_patterns;

public class SingletonPatternDemo {

	public static void main(String[] args) {
		
			SingleObject object = SingleObject.getInstance();
			object.showMessage();

	}

}
