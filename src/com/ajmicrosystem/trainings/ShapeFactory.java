package com.ajmicrosystem.trainings;

public class ShapeFactory {
	
	public Shape getShape(String shapetype) {
		
		if(shapetype==null) {
			return null;
		}
		
		if(shapetype.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();
		}
		
		
		if(shapetype.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}
		
		

		return null;
		
		
	}

}
