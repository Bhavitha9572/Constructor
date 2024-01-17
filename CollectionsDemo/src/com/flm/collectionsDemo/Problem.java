package com.flm.collectionsDemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class Problem {
public static void main(String[] args) {
	String name="TOMATO";
	char[] nameArray = name.toCharArray();
    Map<Character, Integer> map =new LinkedHashMap<>();
    
    for(char tempChar :nameArray) {
    	if(map.get(tempChar)==null) {
    		map.put(tempChar, 1);
    	}else {
    		Integer occurenceCount =map.get(tempChar);
    		map.put(tempChar, occurenceCount+1);
    		
    	}
    }
    System.out.println(map);
}
}
