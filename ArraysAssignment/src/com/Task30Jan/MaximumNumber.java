package com.Task30Jan;

public class MaximumNumber {
	
	public static int maxnum(int a[])
	{
		int maxno=0;
		for(int i=0;i<a.length;i++) 
		{
		if (a[i]>maxno) 
		{
			maxno=a[i];
		}
		}
		System.out.println("Maximum number :"+maxno);
		return maxno;
		
	}
	public static int minimumnum(int a[])
	{
		int minino=0;
		for(int i=1;i<a.length;i++) 
		{
		if (a[i]<minino) 
		{
			minino=a[i];
		}
		}
		System.out.println("Minimum number :"+minino);
		return minino;
		
	}

	public static void main(String[] args) {
		
		int a[]= {8,3,4,5};
		maxnum(a);
		minimumnum(a);

	}

}
