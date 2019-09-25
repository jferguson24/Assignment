package com.ss.asn2;

public class Rectangle implements Shape
{
	int length;
	int width;
	Rectangle(int length, int width){
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double calculateArea()
	{
		return length * width;
	}

	@Override
	public void display() {
		
		
		System.out.println("*********");
		System.out.println("*       *");
		System.out.println("*********");
		System.out.println();
		
	}
	
}
