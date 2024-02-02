package com.BubbleSorting;

import java.util.Arrays;

public class SortingArrays {
	
	static void sortArray(int arr[]) 
	{
		for(int i=0;i<arr.length;i++) 
		{
			for(int j=i+1;j<arr.length;j++) 
			{
				if(arr[j]<arr[i]) 
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		//System.out.println("Second highest:"+arr[arr.length-2]);
	}

	public static void main(String[] args) {
		
		int arr[]= {2,7,6,8,9,1,5,0};
		
		System.out.println("Before Sorting");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("After sorting");
		sortArray(arr);
		System.out.println(Arrays.toString(arr));

	}

}
