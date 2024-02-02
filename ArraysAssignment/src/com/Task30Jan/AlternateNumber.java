package com.Task30Jan;

//Print the alternate numbers of an array

public class AlternateNumber {
	public static void printalternative(int a[]) 
	{
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]%2!=0) 
			{
				System.out.println(a[i]);
			}
			
	}
	}

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5,6};
		printalternative(a);

	}

}
