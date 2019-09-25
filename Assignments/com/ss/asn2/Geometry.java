package com.ss.asn2;

public class Geometry {

	public static void main(String[] args) {
		
		Circle circle = new Circle(5);
		Rectangle rect =  new Rectangle(10,8);
		Triangle triangle = new Triangle(5,3);
	
		
		circle.display();
		System.out.println("Area is of the circle is: " + circle.calculateArea());
		rect.display();
		System.out.println("Area is of the rectangle is : " + rect.calculateArea());
		triangle.display();
		System.out.println("Area is of the triangle is : " + triangle.calculateArea());

	}

}
