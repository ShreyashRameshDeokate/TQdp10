package com.BubbleSorting;

import java.util.Arrays;

public class ShiftZeroAtEnd {
	
	static void shiftzero(int arr[])
	{
		int count=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(arr[i]!=0) 
			{
				arr[count]=arr[i];//arr[count++]=arr[i];
				count++;
			}
		}
		while(count<arr.length) 
		{
			arr[count++]=0;
		}
	}
	public static void main(String[] args) {
		int arr[] = { 5, 6, 0, -7, 5, 0, 4, 0, 5, 6, 2 };

		System.out.println(Arrays.toString(arr));
		
	}

}
