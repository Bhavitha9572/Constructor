package com.flm.collectionsDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo { 
	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<>(); //no insertion no duplicate
		hs.add("ramesh");
		hs.add("suresh");
		hs.add("harish");
		hs.add("harish");
		hs.add("vinny");
		hs.add("abdul");
		
		System.out.println(hs );
		
		LinkedHashSet<String> lhs = new LinkedHashSet<>(); ///insertion order maintain no duplicates
		lhs.add("ramesh");
		lhs.add("suresh");
		lhs.add("harish");
		lhs.add("harish");
		lhs.add("vinny");
		lhs.add("abdul");
		System.out.println(lhs );
		
		TreeSet<String> ts = new TreeSet<>(); ///insertion order ascending order maintain no duplicates
		ts.add("ramesh");
		ts.add("suresh");
		ts.add("harish");
		ts.add("harish");
		System.out.println(ts );
	}

}
