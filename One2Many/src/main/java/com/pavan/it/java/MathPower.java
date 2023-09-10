package com.pavan.it.java;
import java.util.*;
import java.lang.*;
public class MathPower {
	public static void main(String []args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(2);
		al.add(4);
		al.add(6);
		al.add(8);
		System.out.println("al..."+al);
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		al1.add(3);
		al1.add(7);
		al1.add(9);
		al1.add(11);
		System.out.println("al1..."+al1);
		System.out.println("new al1.."+al1.addAll(al));
		System.out.println(al1);
		 Collections.sort(al1);
	     System.out.println("sorted al1: " + al1);
		List<Integer> ls = al1;
		for(Integer a:ls) {
			System.out.println(a);
			//ArrayList<Integer> sortedList = a
		}
		
	}
		

}
