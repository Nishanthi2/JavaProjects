package com.deloitte.exceptions.main;

public class MainClass {
public static void main(String[] params) {
	try {
	System.out.println(params[0]  + params[1]);//concatenates so requires two inputs
	System.out.println(Integer.parseInt(params[0])  + Integer.parseInt(params[1]));//if adds req int inputs, divs so req no zero input as second parameter
	try {
		System.out.println(2/0);
	}catch(ArithmeticException ex1){//if this wasn't a matching catch, the outer catch that matches can work
		System.out.println("can't divide by 0");
		
	}
	
	System.out.println("end of try");
	
}catch(ArrayIndexOutOfBoundsException ex) {
	System.out.println("please give two valid inputs");//for arrayindexoutofbounds exception
	try {
		System.out.println(2/0);
	}catch(ArithmeticException ex1){//if this wasn't a matching catch, the outer catch that matches also cannot work
		System.out.println("can't divide by 0");
		
	}
}catch(NumberFormatException nex) {
	System.out.println("pls enter valid numbers");//for numberformatexception
}//catch(ArithmeticException aex) {//since it can't divide by 0
	//System.out.println("pls don't enter 0");
	System.out.println("end");
}
}
