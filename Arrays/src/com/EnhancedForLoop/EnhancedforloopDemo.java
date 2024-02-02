package com.EnhancedForLoop;

import java.util.Scanner;

public class EnhancedforloopDemo {

	public static void main(String[] args) {
		//cannot use;
		//refer index;
		//updation
		
		int ar[]= {2,3,4,5,6,7};
		
//		for(int i=0;i<ar.length;i++) 
//		{
//			System.out.println(ar[i]);
//		}
		
		for(int x:ar) 
		{
			System.out.println(x);
		}
		
		Scanner sc=new Scanner(System.in);
		
		int arr[]=new int[3];
		
		for(int i=0;i<arr.length;i++) 
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter elements");
		for(int x:arr) 
		{
			x=sc.nextInt();
		}
		for(int x:arr) 
		{
			System.out.println(x);
		}

	}

}
