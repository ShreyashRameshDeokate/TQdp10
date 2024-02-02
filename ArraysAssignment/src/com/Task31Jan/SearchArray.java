package com.Task31Jan;

import java.util.Scanner;

//WAP to search for a given number in an array and 
//accordingly print the index if exists.

public class SearchArray {
	public static boolean findArray(int arr[],int num)
	{
		boolean flag=false;
		int count=0;
		
		for(int i=0;i<arr.length;i++) 
		{    count++;
			if(arr[i]==num)
			{
			
				System.out.println("Array Found :"+num+" index is :"+count);
				return flag=true;
			}
		}
			if(flag==false) 
		{
			System.out.println("Element not found");
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int arr[]= {1,2,7,4,5,6};
		System.out.println("Enter number");
		int num=sc.nextInt();
		
		findArray(arr, num);

	}

}
