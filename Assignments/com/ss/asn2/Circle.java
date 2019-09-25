package com.ss.asn2;

public class Circle implements Shape{

	double radius;
	
	Circle (int radius){
		this.radius = radius;
	}
	@Override
	public double calculateArea() 
	{
		return (Math.PI * radius * radius);
	}

	@Override
	public void display() {
		System.out.println(" **** ");
		System.out.println("******");
		System.out.println("******");
		System.out.println(" **** ");
		System.out.println();
	}

}
