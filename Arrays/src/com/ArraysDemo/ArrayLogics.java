package com.ArraysDemo;

public class ArrayLogics {
	static boolean searchElements(int arr[],int ele)
	{
		for(int i=0;i<=arr.length;i++)
		{
			if(arr[i]==ele)
				return true;
		}
		return false;
	}
	
	static void searchElementOccurence(int arr[],int ele)
	{
		boolean flag =false;
		for(int i=0;i<=arr.length;i++) 
		{
			if(arr[i]==ele) 
			{
				flag=true;
				System.out.println("Position :"+i);
			}
		}
		if(!flag)
			System.out.println("Element not found");
	}

	public static void main(String[] args) {
		
		int arr[]= {2,3,5,6,7,8,9,4};
		
		if(searchElements(arr, 6)) 
		{
			System.out.println("Element found");
		}
		else 
		{
			System.out.println("Element not found");
		}
		System.out.println("-----------------------------");
		
		searchElementOccurence(arr, 6);

	}

}
