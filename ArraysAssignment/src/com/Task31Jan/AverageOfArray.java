package com.Task31Jan;

import java.util.Scanner;

//WAP to accept dimension of 1D array and create and accept data in that array. 
//Calculate the average value of array elements.

public class AverageOfArray {
	public static void findAverage(int arr[])
	{
		int sum=0;
		int avg;
		for(int i=0;i<arr.length;i++) 
		{
			sum+=arr[i];
		}
		avg=sum/arr.length;
		
		System.out.println("Average of Arrays :"+avg);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Size");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		System.out.println("Enter Elements :");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		findAverage(arr);
		
		
		

	}

}
