package com.ArraysDemo;

import java.util.Arrays;

public class PassingArrays {
	
	static void squareofElement(int arr[]) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=arr[i]*arr[i];
		}
		System.out.println("inside method");
		System.out.println(Arrays.toString(arr));
	} 
	
	int sumofElements (int arr	[]) 
	{
		int sum=0;
		for(int i=0;i<arr.length;i++) 
		{
			sum+=arr[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6};
		
		int a[]= {7,8,9,5};
		System.out.println(arr);//object 
		
		System.out.println(Arrays.toString(arr));
	

		squareofElement(arr);
		System.out.println("-----------------------------");
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.toString(a));
		
		squareofElement(a);
		System.out.println("-----------------------------");
		System.out.println(Arrays.toString(a));
		
		System.out.println("=================================");
		PassingArrays a1=new PassingArrays();
		
		//Annonymous
		System.out.println("Sum is :"+a1.sumofElements(new int[] {2,3,4,5}));
		
		
		
	}

}
