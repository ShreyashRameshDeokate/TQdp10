package com.BubbleSorting;

import java.util.Arrays;

public class SumOfPair {
	
	public static void sumOfpair(int arr[])
	{
		int sum=8;
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]+arr[j]==sum) 
				{
					System.out.println(arr[i]+""+arr[j]+" "+sum);
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		System.out.println(Arrays.toString(arr));
		
		sumOfpair(arr);
		

	}

}
