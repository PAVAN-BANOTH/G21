package in.pspk;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 4, 2, 2, 6};

        int majorityElement = findMajorityElement(arr);

        System.out.println("Majority Element: " + majorityElement);
    }

    public static int findMajorityElement(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                int count = map.get(num);
                map.put(num, count + 1);
            }
        }
    	System.out.println(map);
    	System.out.println("majorityElement finding Starts here");

        int majorityElement = -1;
        int maxCount = -1;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey();
            int count = entry.getValue();
            
            if (count > arr.length / 2) {
                if (count > maxCount) {
                    majorityElement = num;
                    maxCount = count;
                }
            }
        }
        
        return majorityElement;
    }
}

