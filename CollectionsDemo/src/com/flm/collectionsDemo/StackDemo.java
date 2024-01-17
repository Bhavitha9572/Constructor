package com.flm.collectionsDemo;

import java.util.Stack;

public class StackDemo {
	public static void main(String[] args) {
		Stack<String> st = new Stack<>();  //Last in first out
		
		st.push("Ramesh");
		st.push("Suresh");
		st.push("Harish"); /// Ramesh 1st inserted and suresh after harish
		
		String s =st.pop(); //here it is deleted Harish 
		
		int  s1= st.search("Harish"); //while searching it is not there 
		
		System.out.println(s1); //so the output is -1
		
	}

}
