package com.Task1feb;

import java.util.Arrays;

//WAP to half sort the array in ascending and half in descending

public class AscendingDecending {
	
	static void printAscendingDecending(int arr[]) 
	{
		for(int i=0;i<arr.length/2;i++) 
		{
			for(int j=i+1;j<arr.length/2;j++) 
			{
				if(arr[i]>arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=arr.length/2;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[i]<arr[j]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[]= {9,1,5,3,8,6,4};
		
		System.out.println("Before Ascending and decending order");
		System.out.println(Arrays.toString(arr));
		
		printAscendingDecending(arr);
		System.out.println("In Ascending and decending order ");
		System.out.println(Arrays.toString(arr));

	}

}
