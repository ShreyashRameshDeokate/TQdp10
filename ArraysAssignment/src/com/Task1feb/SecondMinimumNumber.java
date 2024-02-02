package com.Task1feb;

import java.util.Arrays;

//Find the second minimum number in an array without sorting

public class SecondMinimumNumber {
	public static int findSecondMinimum(int arr[])
	{
		int minimum=Integer.MAX_VALUE;
		int secondminimum=Integer.MAX_VALUE;
		
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]<minimum) 
			{
				secondminimum=minimum;
				minimum=arr[i];
			}else if(arr[i]<secondminimum) 
			{
				secondminimum=arr[i];
			}
		}
		return secondminimum;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));
		findSecondMinimum(arr);
		System.out.println("Second minimum :"+findSecondMinimum(arr));

	}

}
