package com.pavan.it.java;


import java.util.*;


public class LongestSubsequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first string:");
        String string1 = sc.nextLine();
        
        System.out.println("Enter the second string:");
        String string2 = sc.nextLine();
        
        int length1 = string1.length();
        int length2 = string2.length();
        int maxLength = Math.min(length1, length2);
        
        StringBuilder longestSeq = new StringBuilder();
        
        for (int i = 0; i < maxLength; i++) {
            if (string1.charAt(i) != string2.charAt(i)) {
                break;
            }
            
            longestSeq.append(string1.charAt(i));
        }
        
        System.out.println("Longest common sequence is: " + longestSeq.toString());
        
        sc.close();
    }
}
