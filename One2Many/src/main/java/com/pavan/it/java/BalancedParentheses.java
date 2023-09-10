package com.pavan.it.java;

import java.util.Stack;

public class BalancedParentheses {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();

        for (char c : str.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else if (c == ')' && !st.isEmpty() && st.peek() == '(') {
                st.pop();
            } else if (c == '}' && !st.isEmpty() && st.peek() == '{') {
                 st.pop();
            } else if (c == ']' && !st.isEmpty() && st.peek() == '[') {
                st.pop();
            } else {
                return false;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = "({[]})";
        
       // System.out.println(isBalanced(str1));  // Output: true

        String str2 = "({[}])";
        //System.out.println(isBalanced(str2));  // Output: false
        if(isBalanced(str2)) {
        	System.out.println("isBalanced");
        }else
        	System.out.println("Not Balanced");
    }
}

