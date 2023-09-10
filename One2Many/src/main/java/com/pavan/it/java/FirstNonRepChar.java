package com.pavan.it.java;


public class FirstNonRepChar {
	public static void main(String[] args) {

        String str = "jjaval";
        for(Character ch:str.toCharArray()) {
            if(str.indexOf(ch) == str.lastIndexOf(ch)) {
                //System.out.println("First non repeat character = " + ch);
                //break;//FirstNonRepChar remove //
            }
        }
        String ch = null;
		System.out.println("First non repeat character = " + ch);
    }
}
 