package com.deloitte.main;

import java.util.LinkedList;

//in the question, they had given delete add elem to first last, and a specified index. they didn't
//mention that duplication isn't allowed. thus, linkedList

public class MainClass {
	
	
	public static void main(String[] args) {
	LinkedList<String> result = new LinkedList<String>();
	
	result.add("B");
	result.add("C");
	result.add("D");
	result.add("X");
	result.add("Y");
	result.add("Z");
	result.add("A");
	
	result.add(1, "A2");
	
	System.out.println("Original contents of result : " + result);
	
	//to remove elem
	result.remove("F");
	result.remove(2);
	
	System.out.println("contents of result after deletion : " + result);
	
	//remove 1st and last elem
	result.removeFirst();
	result.removeLast();
	
	System.out.println("result after deleting first and last elements : " + result);
	
	//make changes get, set
	String val = result.get(2);
	result.set(2, val + " changed");
	
	System.out.println("result after change: " + result);
}
}
