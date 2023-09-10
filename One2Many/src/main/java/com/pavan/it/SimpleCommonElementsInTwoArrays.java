package com.pavan.it;

import java.util.*;

public class SimpleCommonElementsInTwoArrays {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 5, 7, 9};

        List<Integer> commonElements = new ArrayList<>();

        for (int num1 : array1) {
            for (int num2 : array2) {
                if (num1 == num2) {
                    commonElements.add(num1); // Add the common element to the list
                    break; // Stop searching once a common element is found
                }
            }
        }

        // Print the common elements
        System.out.println("Common Elements: " + commonElements);
    }
}
