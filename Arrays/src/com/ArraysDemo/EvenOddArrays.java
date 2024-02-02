package com.ArraysDemo;

import java.util.Arrays;

public class EvenOddArrays {
	public static void showEvenOdd(int arr[]) 
	{
		int evenNo[]=new int[8];
		int oddNo[]=new int[8];
		int j=0;
		int evenindex=0;
		int oddindex=0;
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]%2==0) 
			{
				evenNo[evenindex]=arr[i];
				evenindex++;
			}
			else 
			{
				oddNo[oddindex]=arr[i];
				oddindex++;
			}
		}
		System.out.println(" Even Number :"+Arrays.toString(evenNo));
		System.out.println("Odd Number :"+Arrays.toString(oddNo));
	}
	

	public static void main(String[] args) {
		
		int arr[]= {78,85,56,45,85,77,88,66};
		
		showEvenOdd(arr);
		
		
		
		
		

	}

}
