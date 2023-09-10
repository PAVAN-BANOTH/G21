package com.pavan.it.java;

import java.util.Arrays;

public class LargestNumber {
    public static void main(String[] args) {
        int[] a = {12, 45, 47, 85, 65, 57};

        
        
        Arrays.sort(a);
        
        int largest = a[a.length - 1];
        
        int smallest = a[0];

        System.out.println("Largest element: " + largest);
        System.out.println("smallest element: " + smallest);
    }
}
