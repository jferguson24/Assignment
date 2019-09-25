package com.ss.asn1;

public class StarShow 
{

	public static void main(String[] args) {
		int count = 9;
	
		System.out.println("1)");
		printStarForw(4);
		printDash(count++);
		
		System.out.println();
		System.out.println("2)");
		printDash(count++);
		printStarBack(4);
		
		System.out.println("3)");
		printStarMid(4);
		printDash(count++);
		
		System.out.println();
		System.out.println("4)");
		printDash(count++);
		printStarMidB(4);
		
		
	}
	
	public static void printDash(int num)
	{
		for(int i = 0; i < num; i++)
		{
			System.out.print("-");
		}
		System.out.println();
	}
	
	public static void printStarForw(int num)
	{
		for(int i = 0; i <= num; i++)
		{
			switch(i) {
				case(1):
					System.out.println("*");
					break;
				case(2):
					System.out.println("**");
					break;
				case(3):
					System.out.println("***");
					break;
				case(4):
					System.out.println("****");
					break;
			}
				
		}
		
	}
	
	public static void printStarBack(int num)
	{
		for(int i = 0; i <= num; num--)
		{
			switch(num) {
			case(1):
				System.out.println("*");
				break;
			case(2):
				System.out.println("**");
				break;
			case(3):
				System.out.println("***");
				break;
			case(4):
				System.out.println("****");
				break;
			}
		
		}
		System.out.println();
	}
	
	public static void printStarMid(int num)
	{
		for(int i = 0; i <= num; i++)
		{
			switch(i) {
			case(1):
				System.out.println("     *");
				break;
			case(2):
				System.out.println("    ***");
				break;
			case(3):
				System.out.println("   *****");
				break;
			case(4):
				System.out.println("  *******");
				break;
			}
		
		}
		
	}
	
	public static void printStarMidB(int num)
	{
		for(int i = 0; i <= num; num--)
		{
			switch(num) {
			case(1):
				System.out.println("     *");
				break;
			case(2):
				System.out.println("    ***");
				break;
			case(3):
				System.out.println("   *****");
				break;
			case(4):
				System.out.println("  *******");
				break;
			}
		
		}
		System.out.println();
	}
}
