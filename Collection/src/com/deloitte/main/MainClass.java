package com.deloitte.main;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

class Point <T>{
	private T x;
	private T y;
	public T getX() {
		return x;
	}
	public void setX(T x) {
		this.x = x;
	}
	public T getY() {
		return y;
	}
	public void setY(T y) {
		this.y = y;
	}
}
class DBAccess{
	public Collection<String> getResult1(){
		HashSet<String> result = new HashSet<String>();//can be linked list too
		
		result.add("A");
		result.add("c");
		result.add("B");
		result.add("A");
		result.add("c");
		result.add("B");
		
		return result;
	}
		
		public Collection<String> getResult2(){
			LinkedList<String> result3 = new LinkedList<String>();//can be linked list too
			
			result3.add("A");
			result3.add("c");
			result3.add("B");
			result3.add("A");
			result3.add("c");
			result3.add("B");
			
			return result3;
	}
}

public class MainClass {
public static void main(String[] args) {
	Point<Float> point1 = new Point<Float>();
	point1.setX(7.7f);
	point1.setY(9.9f);
	System.out.println(point1.getX()+","+point1.getY());
	Point<Integer> point2 = new Point<Integer>();
	point2.setX(7);
	point2.setY(9);
	System.out.println(point2.getX()+","+point2.getY());
	
	//linkedlist//(ordered and allows duplicate)
	LinkedList<String> list = new LinkedList<String>();
	
	list.add("A");
	list.add("c");
	list.add("B");
	
	for(String element : list)
	{
		System.out.println(element);
	}
	
	//hashset set:unordered and doesnt allow duplicates and sorts it.
	HashSet<String> result = new HashSet<String>();
	
	result.add("A");
	result.add("c");
	result.add("B");
	result.add("A");
	result.add("c");
	result.add("B");
	
	for(String element : result)
	{
		System.out.println(element);
	}
	
	DBAccess dba = new DBAccess();
	Collection<String> result2 = dba.getResult1();	
	System.out.println(result2);
	
	Collection<String> result4 = dba.getResult2();	
	System.out.println(result4);
	
	}
}
