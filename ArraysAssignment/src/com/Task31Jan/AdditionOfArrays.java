package com.Task31Jan;

import java.util.Arrays;

public class AdditionOfArrays {
	 public static void displaySumofArray(int arr[],int arr1[]) 
	 {
		int sum1[]=new int[arr.length];
		 int sum;
		 for(int i=0; i<arr.length;i++)
		 {
			 sum=arr[i]+arr1[i];
			 
			 sum1[i]=sum;
			 
			
		 }
		 System.out.println("Sum of arrays :"+Arrays.toString(sum1));
		 
	 }

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		int arr1[]= {7,8,9,2,3,4};
		
		displaySumofArray(arr, arr1);

	}

}
