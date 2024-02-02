package com.Task31Jan;

import java.util.Arrays;

//WAP to copy an array by iterating the array.

public class CopyArray {
	public static void copy(int arr[]) 
	{
		int copy[]=new int[arr.length];
		
		for(int i=0;i<copy.length;i++)
		{
			copy[i]=arr[i];
		}
		System.out.println("Orignal Array :"+Arrays.toString(arr));
		System.out.println("Copy of Array :"+Arrays.toString(copy));
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		copy(arr);

	}

}
