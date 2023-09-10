package com.pavan.it.java;

import java.util.Arrays;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] a = {2, 5, 6, 2, 7, 5, 8, 9, 5, 6, 2, 7, 8, 9, 5};
        Arrays.sort(a);

        int count = 1;
        for (int i = 1; i < a.length; i++) {
            if (a[i] == a[i - 1]) {
                count++;
            } else {
                System.out.println("Element: " + a[i - 1] + ", Frequency: " + count);
                count = 1;
            }
        }
        System.out.println("Element: " + a[a.length - 1] + ", Frequency: " + count);
    }
}
