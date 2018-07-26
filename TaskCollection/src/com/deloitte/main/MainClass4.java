package com.deloitte.main;

import java.util.HashSet;
//import java.util.LinkedList;

class Address1{
	private String name;
	private String street;
	private String city;
	private String state;
	private String code;
	
	Address1(String n, String s, String c, String st, String cd){
		name = n;
		street = s;
		city = c;
		state = st;
		code = cd;
	}
		
		public String toString() {
			return name + "\n" + street + "\n" + city + " " + state + " " + code + "\n";
		}
}

public class MainClass4 {
public static void main(String[] args) {
	HashSet<Address1> m2 = new HashSet<Address1>();
	
	//add elem to the linked list
	m2.add(new Address1("J.W.West","11 Oak Ave","Urbana","IL", "60801"));
	m2.add(new Address1("Ralph Baker","1142 Maple lane","Mahome","IL", "61853"));
	m2.add(new Address1("Tom Carlton","687 Elm St","Champaign","IL", "61820"));
	m2.add(new Address1("J.W.West","11 Oak Ave","Urbana","IL", "60801"));
	
	
	//display this list
	for(Address1 result1 : m2) {
	System.out.println("address:" + result1);}
	
	
}
}

