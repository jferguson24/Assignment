package com.ss.asn2;

public class LargestNum {

	public static void main(String[] args) {
		int array[][] = { { 2,4,22}, {555,2,1000} };
		
		int max = array [0][0];
		
		for(int i = 0; i < 2; i++)
		{
			for(int o = 0; o < 3; o++) 
			{
				if(max < array[i][o])
					max = array[i][o];
			}
			System.out.println();
		}
		System.out.println("Largest number from set is " + max);
	}

}
