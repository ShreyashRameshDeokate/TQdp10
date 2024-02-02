package com.ArraysDemo;

import java.util.Arrays;

public class SumofEven {
	
	int evenSum(int arr[])
	{
		int sum=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]%2==0) 
			{
				sum+=arr[i];
			}
			System.out.println("Sum :"+sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6,7,8};
		System.out.println(arr);
		System.out.println(Arrays.toString(arr));
		
		SumofEven e1=new SumofEven();
		e1.evenSum(arr);
		

	}

}
