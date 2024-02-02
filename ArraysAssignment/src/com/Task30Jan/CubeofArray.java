package com.Task30Jan;

import java.util.Scanner;

//Print cube of each number in array

public class CubeofArray {
	
	public static void cube(int a[]) 
	{
		int cube;
		for(int i=0;i<a.length;i++) 
		{
			cube=a[i]*a[i];
			System.out.println(cube);
		}
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.err.println("Enter size");
		int size=sc.nextInt();
		
		int a1[]=new int [size];
		
		System.out.println("Enter Elements");
		for(int i=0;i<a1.length;i++)
		{
			a1[i]=sc.nextInt();
		}
		cube(a1);
		
		
		
//		int a[]= {2,3,4,5,6,7};
//		cube(a);
		

	}

}
