package com.BubbleSorting;

import java.util.Arrays;

public class RightRotateArray {
	static void rotateOnce(int arr[])
	{
		int len=arr.length;
		int lastE=arr[len-1];
		
		//Shifting
		for(int i=len-1;i>0;i--) 
		{
			arr[i]=arr[i-1];
		}
		arr[0]=lastE;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------------------------");
		for(int i=0;i<3;i++) 
		{
			rotateOnce(arr);
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("---------------------------");
		
		System.out.println(Arrays.toString(arr));

	}

}
