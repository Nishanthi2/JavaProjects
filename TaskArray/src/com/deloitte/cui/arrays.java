package com.deloitte.cui;

public class arrays {
	public static void main(String[] args) {
		
		int [] n = new int[10];
		int [] m = new int[5];
		
		for(int i = 0; i < 10; i++)
		{
			n[i] = i;
			System.out.println(n[i]);
		}
		
		for(int j = 0; j < 5; j++)
		{
			m[j] = j+1;
			System.out.println(m[j]);
		}	
		
	System.arraycopy(m, 0, n, 0, m.length);
	for(int target : n)
	{
		System.out.println(target);
	}
	}
	
}
