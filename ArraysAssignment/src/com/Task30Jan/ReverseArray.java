package com.Task30Jan;

import java.util.Arrays;
import java.util.Scanner;

// Reverse the array


public class ReverseArray {

	public static void arrayReverse(int a[]) 
	{
		int a1[]=new int[a.length];
		int index=0;
		for(int i=a.length-1;i>=0;i--) 
		{
			a1[index++]=a[i];
		}
		System.out.println(Arrays.toString(a1));
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		
		System.out.println("Enter size");
		int size=sc.nextInt();
		
		
		int a[]= {1,2,3,4,5,6};
		arrayReverse(a);
		System.out.println(Arrays.toString(a));
	}
}
