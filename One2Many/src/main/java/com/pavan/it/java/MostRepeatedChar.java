package com.pavan.it.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class MostRepeatedChar {
    public static void main(String[] args) {
        String input = "Hello World";
        String maxChars = findMaxChar(input);
        System.out.println("Most repeated character(s): " + maxChars);
    }

    private static String findMaxChar(String str) {
        char[] array = str.toCharArray();
        Set<Character> maxChars = new LinkedHashSet<>();

        int maxCount = 1;
        maxChars.add(array[0]);

        for (int i = 0, j = 0; i < str.length() - 1; i = j) {
            int count = 1;
            while (++j < str.length() && array[i] == array[j]) {
                count++;
            }
            if (count > maxCount) {
                maxCount = count;
                maxChars.clear();
                maxChars.add(array[i]);
            } else if (count == maxCount) {
                maxChars.add(array[i]);
            }
        }

        return maxChars + " = " + maxCount;
    }
}
