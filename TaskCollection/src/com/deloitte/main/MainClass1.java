package com.deloitte.main;

import java.util.ArrayDeque;
//  import java.util.Stack;

public class MainClass1 {
	public static void main(String[] args) {
		ArrayDeque<String> adq = new ArrayDeque<String>();
		adq.push("A");
		adq.push("B");
		adq.push("D");
		adq.push("E");
		adq.push("F");
		
		System.out.println("popping the stack: ");
		
		while(adq.peek() != null){
			System.out.println(adq.pop() + " ");}
		
		System.out.println();
	}

}
