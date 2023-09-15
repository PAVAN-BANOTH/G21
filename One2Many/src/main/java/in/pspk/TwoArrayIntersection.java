package in.pspk;

import java.util.*;

public class TwoArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        int[] intersection = findIntersection(arr1, arr2);

        System.out.println("Intersection of Arrays:");
        for (int num : intersection) {
            System.out.print(num + " ");
        }
    }

    public static int[] findIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int num : arr1) {
            set1.add(num);
        }

        for (int num : arr2) {
            if (set1.contains(num)) {
                set2.add(num);
            }
        }

        int[] intersection = new int[set2.size()];
        int index = 0;

        for (int num : set2) {
            intersection[index++] = num;
        }

        return intersection;
    }
}
