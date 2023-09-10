package com.pavan.it;
import java.util.*;
public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("E");
		al.add(9);
		System.out.println(al);
		al.add(2,"F");
		al.set(4, "G");
		System.out.println(al);
		al.remove(5);
		System.out.println(al);
		Object[] arr = al.toArray();
		for(Object a:arr) {
			System.out.print(a+" ");
		}
		
		

	}

}
