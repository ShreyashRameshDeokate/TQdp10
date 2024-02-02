package com.ArraysDemo;

//sum of prime nunbers

public class PrimeNo {
	public static boolean findPrime(int num)
	{
		if(num<=1)
		return false;
		else 
		{
			boolean flag=true;
			for(int i=2;i<=num/2;i++) 
			{
				if(num%i==0) 
				{
					flag=false;
					break;
				}
			}return flag;
		}
			
	}
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8};
		int sum=0;
		for(int i=0;i<arr.length;i++) 
		{
			if(findPrime(arr[i]))
				sum=sum+arr[i];
		}
		System.out.println("Sum :"+sum);
	}

}
