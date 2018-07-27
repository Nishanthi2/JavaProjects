package com.deloitte.arithmetic;

import java.io.*;
class InputAssume
{
	static int n=0,element;
	static boolean TF;
	public static boolean checkTriplets(int arr1[])
	{
		for(int i : arr1)
		{
			n++;
		}
		int counter[] = new int[100];
		
		for(int i=0;i<n;i++)
		{
			element=arr1[i];
			for(int j=i+1;j<n;j++)
			{
				if(element == arr1[j])
				{
					counter[element]++;
					if(counter[element]==3)
					{
						
						return true;
					}
				}
			}
		} 
		return false;
	}
}

public class TripletCheck 
{
	public static void main(String args[])throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("\nEnter the size of your array :\n");
		int n = Integer.parseInt(br.readLine());
		int arr[]= new int[n];
		for(int i=0;i<n;i++)
		{
				arr[i]=Integer.parseInt(br.readLine());
		}
		System.out.println(InputAssume.checkTriplets(arr));
	}
}
