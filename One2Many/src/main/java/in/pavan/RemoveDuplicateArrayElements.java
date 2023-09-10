package in.pavan;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateArrayElements {
    public static void main(String[] args) {
        int[] a = {12, 322, 54, 61, 72, 12};
        int temp;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) { // < reverse order
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        
        System.out.println("After Sorting and Removing Duplicates:");
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] != a[i + 1]) {
                System.out.print(" " + a[i]);
            }
        }
        
        // Print the last element which is not checked in the loop
        System.out.print(" " + a[a.length - 1]);
    }
}
