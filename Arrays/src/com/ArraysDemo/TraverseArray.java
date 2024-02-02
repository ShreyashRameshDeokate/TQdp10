package com.ArraysDemo;

public class TraverseArray {

	public static void main(String[] args) {
		
		int []arr=new int[5];
		arr[0]=90;
		arr[1]=80;
		arr[2]=70;
		arr[3]=60;
		arr[4]=50;
	//	arr[5]=40; out of bound
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr[i]);
		}
		
		//array as literal
		int arr1[]= {5,6,7,8,9};
		
		for(int i=0;i<arr.length;i++) 
		{
			System.out.println(arr1[i]);
		}
	}

}
