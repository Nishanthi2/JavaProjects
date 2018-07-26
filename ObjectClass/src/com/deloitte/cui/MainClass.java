package com.deloitte.cui;

public class MainClass {
	public static void main(String[] args) {
		point p1 = new point(2,4);
		point p2 = new point(2,4);
		String str;
		str = " X & Y :" +p1;
		System.out.println(str);
		System.out.println(p1.equals(p2));
	}

}
