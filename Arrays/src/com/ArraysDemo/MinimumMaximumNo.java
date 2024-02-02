package com.ArraysDemo;

public class MinimumMaximumNo {
	public static void maxminiNum(int arr[])
	{
		int maxNo=0;
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if (arr[i]>maxNo) 
			{
				maxNo=arr[i];
			}
			if(arr[i]<min) 
			{
				min=arr[i];
			}
		}
		System.out.println("Maximum Number :"+maxNo);
		System.out.println("Miniimum Number :"+min);
		
	}
	public static void main (String args[]) 
	{
		int arr[]= {1,2,3,4,5,6};
		
		maxminiNum(arr);
	}

}