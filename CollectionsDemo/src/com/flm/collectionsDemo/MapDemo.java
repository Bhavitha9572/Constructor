package com.flm.collectionsDemo;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.HashMap;
import java.util.Queue;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		
		

	}

	private static void QueueDemo() {
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.offer(4);
		System.out.println(q);
		System.out.println(q.element());
	}

	private static void HashMapDemo() {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Upendra");
		map.put(2, "Surendra");
		map.put(3, "bhavitha");
		map.put(1, "sindhu");
		map.put(4, "bhavitha");

		System.out.println(map.get(1));

		Set<Integer> keyset = map.keySet();
		System.out.println(keyset);

		Collection<String> values = map.values();
		System.out.println(values);
	}

}
