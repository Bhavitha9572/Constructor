package com.flm.collectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("ramesh");
		l1.add("suresh");
		l1.add("harish");
		l1.add("harsish");
		
		System.out.println(l1);
		
		for (int i = 0; i < l1.size(); i++) {
			
			System.out.println(l1.get(i));
			
		}
		System.out.println();
		
		for(String temp :l1) {
			System.out.println(temp);
		}
		System.out.println();
		
		Iterator<String> itr =l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		l1.clear();
		System.out.println(l1.size());
	}

}
