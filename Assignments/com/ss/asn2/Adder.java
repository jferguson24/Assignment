package com.ss.asn2;

public class Adder {

	public static void main(String[] args)
	{
		int total = 0;
		
		for(int i = 0; i < args.length; i++) {
			int num = Integer.parseInt(args[i]);
			total += num;
		}
		System.out.println(total);
	}

}
