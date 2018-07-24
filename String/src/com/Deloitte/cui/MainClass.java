package com.Deloitte.cui;

public class MainClass {
	public static void main(String[] args) {
		String str1 = "Hi";
		//str1 = str1 + " there.";
		String str2 = " there";
		String str3 = new String("Hi");
		String str4 = str1 + str2;
		System.out.println(str1);
		System.out.println(str4);
		System.out.println(str1 == str3);
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
	}

}
