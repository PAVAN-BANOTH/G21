package com.pavan.it.java;

import java.util.TreeSet;

public class SortedSet {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add("D");
		ts.add("F");
		ts.add("A");
		ts.add("X");
		ts.add("B");
		ts.add("P");
		System.out.println(ts);
		System.out.println(ts.first());
		System.out.println(ts.last());
		System.out.println(ts.headSet("F"));
		System.out.println(ts.tailSet("D"));
		System.out.println(ts.subSet("A", "X"));
		System.out.println(ts.ceiling("D"));
		System.out.println(ts.floor("D"));
		System.out.println(ts.pollFirst());
		System.out.println(ts.pollLast());
		System.out.println(ts.descendingSet());
		System.out.println(ts.floor("D"));
		System.out.println(ts.lower("D"));

	}

}
