package com.flm.collectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class CollectionsDemo {
	public static void main(String[] args) {
		List l1 =new ArrayList();
		
		l1.add(1, "hello");  //l1.add(index,object element);
		l1.add(345);
		l1.add("bhavani");
		System.out.println(l1);
		
	}

}
