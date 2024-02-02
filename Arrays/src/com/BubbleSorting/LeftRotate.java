package com.BubbleSorting;

import java.util.Arrays;

public class LeftRotate {
	static void rotateOnce(int arr[])
	{
		int len=arr.length;
		int firstE=arr[0];
		
		//Shifting
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=arr[i+1];
		}
		arr[0]=firstE;
		
	}

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<3;i++) 
		{
			rotateOnce(arr);
			System.out.println(i);
		}
		System.out.println("-----------------------");
		System.out.println(Arrays.toString(arr));

	}

}
