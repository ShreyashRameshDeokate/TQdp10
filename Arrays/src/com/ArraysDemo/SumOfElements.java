package com.ArraysDemo;

public class SumOfElements {

	public static void main(String[] args) {
		
		
		int arr[]= {1,2,3,4,5};
		int sum=0;
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(i);
			sum=sum+arr[i];
		}
		System.out.println(sum);

	}

}
