package com.pavan.it.java;

public class PalindromeChecker {
   
    public static void main(String[] args) {
        String str = "madam";
        
        
        String reversed = new StringBuilder(str).reverse().toString();
        
        if(str.equalsIgnoreCase(reversed)) {
        	System.out.println("Strings are Palindrome");
        	
        }else {
        	System.out.println("Strings are not Palindrome");
        	
        }
        
        
    }
}
