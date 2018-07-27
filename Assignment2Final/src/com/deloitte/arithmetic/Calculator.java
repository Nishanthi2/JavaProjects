package com.deloitte.arithmetic;

import java.io.*;
abstract class Arithmetic
{	static double num1,num2,answer;
	public abstract void Calculate();
	
	Arithmetic()throws IOException
	{
		//read();
		this.num1=num1;
		this.num2=num2;
	}
	static void read() throws IOException
	{	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("Enter the opeation choice :\n");
		//this.num3 = Integer.parseInt(br.readLine());
		System.out.println("Enter the 2 inputs : \n");
		num1 =Double.parseDouble(br.readLine());
		num2 =Double.parseDouble(br.readLine());
	}
	public void display()
	{
		System.out.println("\n the inputs are : "+num1+" , "+num2+"\n and the answer is : "+answer);
	}
	
}
class Addition extends Arithmetic
{
	double n1,n2;
	public Addition() throws IOException
	{super();
	}
	public void Calculate()
	{
		answer = num1+num2;
	}
}
class Subtraction extends Arithmetic
{
	double n1,n2;
	public Subtraction() throws IOException
	{super();
	}
	public void Calculate()
	{
		answer = num1-num2;
	}
}
class Multiplication extends Arithmetic
{
	double n1,n2;
	public Multiplication() throws IOException
	{super();
	}
	public void Calculate()
	{
		answer = num1*num2;
	}
}
class Division extends Arithmetic
{
	double n1,n2;
	public Division() throws IOException
	{super();
	}
	public void Calculate()
	{
		try{
			answer = num1/num2;
		}
		catch(ArithmeticException e){
			System.out.println("\nsorry, division by 0 is not possible");
		}
	}
}
public class Calculator
{
	static int operand;
	
	public static void main(String args[])throws IOException
	{
		BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter operation choice : \n");
		operand = Integer.parseInt(br1.readLine());
		Arithmetic operation[] = new Arithmetic[5];
		
		Arithmetic.read();
		operation[1]= (Addition)new Addition();
		operation[2]= (Subtraction)new Subtraction();
		operation[3]= (Multiplication)new Multiplication();
		operation[4]= (Division)new Division();;
		
		operation[operand].Calculate();
		operation[operand].display();
	}
}
