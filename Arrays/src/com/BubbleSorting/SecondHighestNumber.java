package com.BubbleSorting;

import java.util.Arrays;

public class SecondHighestNumber {
	static int findSecondHighest(int arr[])
	{
		int highest=Integer.MIN_VALUE;//or arr[0];
		int shighest=Integer.MIN_VALUE;//or arr[0];
		
		for(int x: arr) 
		{
			if(x>highest) {
			shighest=highest;
			highest=x;
		}
			else if(x>shighest) 
			{
				shighest=x;
			}	
		}
		return shighest;
		
//		for(int i=0;i<arr.length;i++) 
//		{
//			if(arr[i]>highest) {
//			shighest=highest;
//			highest=arr[i];
//		}
//			else if(arr[i]>shighest) 
//			{
//				shighest=arr[i];
//			}	
//		}
//		return shighest;
		
	}

	public static void main(String[] args) {
		
		int arr[]= {2,7,6,8,9,1,5,0};
		
		System.out.println(Arrays.toString(arr));
		int sh=findSecondHighest(arr);
		System.out.println("Second highest :"+sh);
		
	}

}
