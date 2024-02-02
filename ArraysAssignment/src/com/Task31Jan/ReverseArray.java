package com.Task31Jan;

import java.util.Arrays;

//WAP to print reverse of an array. Also print every 
//alternate element backwards.

public class ReverseArray {
	public static void reverseArray(int arr[]) 
	{
		int arr1[]=new int[arr.length];
		int index=0;
		int temp;
		
		for(int i=arr.length-1;i>=0;i--) 
		{
			if(index%2==0) 
			{
				arr1[index]=arr[i];
			}
			arr1[index++]=arr[i];
			
		}
		System.out.println(Arrays.toString(arr1));
		
	} 

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6};
		reverseArray(arr);

	}

}
