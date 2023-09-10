package com.pavan.it.java;

import java.util.Stack;

public class MyBalParanthesis {
	public static boolean     isBalanced(String str) {
		Stack<Character> st = new Stack<>();
		
		for(char c : str.toCharArray()) {
			if(c =='(' || c =='{' || c =='[') {
				st.push(c);
			}else if(c == ')' && !st.isEmpty()&&st.peek()=='('){
				st.pop();
			}else if(c == '}' && !st.isEmpty()&&st.peek()=='{'){
				st.pop();
			}else if(c == ']' && !st.isEmpty()&&st.peek()=='['){
				st.pop();
			}else {
				st.empty();
			}
			
		}
		return st.isEmpty();
		
	}

	public static void main(String[] args) {
		String str1 = "({[]})";
		System.out.println("String is Balanced");

	}

}
