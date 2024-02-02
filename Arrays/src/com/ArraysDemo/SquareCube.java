package com.ArraysDemo;

import java.util.Scanner;

public class SquareCube {
	public static int[] findSquare(int arr[])
	{
		int square=0;
		for(int i=0;i<arr.length;i++) {
		square=arr[i]*arr[i];
		System.out.println("Square of Element :"+square);
	}
		return arr;
		
		
	}
	public static int[] findCube(int arr[])
	{
		int cube=0;
		for(int i=0;i<arr.length;i++) {
		cube=arr[i]*arr[i]*arr[i];
		System.out.println("Cube of Element :"+cube);
	}
		return arr;
		
		
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]= {2,3,4,5,6,7};
		System.out.println("Enter number 1 for Square And 2 for cube :");
		int num=sc.nextInt();
		
		//By using if else 
		
//		if(num==1) 
//		{
//			findSquare(arr);
//		}else if(num==2) 
//		{
//			findCube(arr);
//		}else 
//		{
//			System.out.println("Entered wrong number");
//		}
		
		//by using Switch case
		switch(num) {
		case 1:
			System.out.println("Square of element ");
			findSquare(arr);
			break;
		case 2:
			System.out.println("Cube of elements ");
			findCube(arr);
			break;
		default :
			System.out.println("Invalid number ");
			break;
		}
		
	
//		int arr[]= {2,3,4,5,6,7};
//		findCube(arr);
//		findSquare(arr);
		
		

	}

}
