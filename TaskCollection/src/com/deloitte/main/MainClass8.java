package com.deloitte.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;;

public class MainClass8 {
	public static void main(String[] args) {
		HashMap<Integer, String> result = new HashMap<Integer, String>();
	
		result.put(123, "ABC");
		result.put(345, "EFG");
		result.put(678, "ABC");
		result.put(321, "HHH");
		
		System.out.println(result.size());		
		System.out.println(result.get(678));
		//to retrieve elements
		//method 1 
		Set<Integer> keys = result.keySet();
		
		for(Integer key: keys) {
			System.out.println(key + ":" + result.get(key));
		}
		//method 2 
		Iterator<Integer> iterator = keys.iterator();
		Integer key;
		while(iterator.hasNext()) {
			key = iterator.next();
			System.out.println(key + "-" + result.get(key));
			}
		}
	}


