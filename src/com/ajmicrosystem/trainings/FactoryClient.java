package com.ajmicrosystem.trainings;

public class FactoryClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ShapeFactory shapefactory = new ShapeFactory();
		
		Shape shape1 =shapefactory.getShape("Rectangle");
		shape1.draw();
		
		Shape shape2 =shapefactory.getShape("Circle");
		shape2.draw();

	}

}
