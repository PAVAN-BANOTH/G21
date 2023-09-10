package com.pavan.it;

public class RemovingDuplicate {
	public static void main(String[] args) {
		String str = "pavan hiiiiiig";
		StringBuilder sb = new StringBuilder();
	
			str.chars().distinct().forEach(c ->sb.append((char)c));
			System.out.println(sb);
			
		
	}

}
