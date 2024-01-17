package com.flm.collectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList<String> a1 =new ArrayList();
		
		a1.add("up");
		a1.add("Down");
		a1.add("east");
		a1.add("23");
		
		for (int i = 0; i < a1.size(); i++) {
			System.out.println(a1.get(i));
			
		}
		System.out.println();
		
		for (String temp : a1) {
		    System.out.println(temp);
			
		}
		System.out.println();
		
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println();
		
		ListIterator<String> li =a1.listIterator();
		while (li.hasNext()) {
			Object object = (Object) li.next();
			System.out.println(object);
			
		}
		System.out.println();
		while (li.hasPrevious()) {
			Object object = (Object) li.previous();
			System.out.println(object);
		}
	}

}
