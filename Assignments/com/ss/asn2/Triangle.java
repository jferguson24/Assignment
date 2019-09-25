package com.ss.asn2;

public class Triangle implements Shape{

	int base;
	int height;
	double half = 0.5;
	
	Triangle(int base, int height){
		this.base = base;
		this.height = height;
	}
	
	@Override
	public double calculateArea(){
		return base * height * half;
	}

	@Override
	public void display() {
	System.out.println(" *");
	System.out.println("* *");
	System.out.println();
	}
	

}
