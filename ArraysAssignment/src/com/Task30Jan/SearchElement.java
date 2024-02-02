package com.Task30Jan;

import java.util.Scanner;

//Search the element in an array

public class SearchElement {
	
	public static boolean show(int a[],int element) 
	{
		boolean flag=false;
		
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]==element) 
			{
				System.out.println("Element found :"+element);
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
		Scanner sc=new Scanner (System.in);
		//System.out.println("Enter Size");
		
		int a[]= {2,3,4,5,6,7};
		show(a,3);

	}

}
