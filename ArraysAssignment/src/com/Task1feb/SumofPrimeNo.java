package com.Task1feb;

//Find the sum of prime numbers in array using enhanced for loop

public class SumofPrimeNo {
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
			}
			return flag;
		}
		
	}

	public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5,6};
		
		int sum=0;
		for(int i: arr) 
		{
			if(findPrime(i))
				sum=sum+i;
		}
		System.out.println("Sum "+sum);
		

	}

}
