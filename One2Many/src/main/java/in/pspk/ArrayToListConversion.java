package in.pspk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListConversion {
    public static void main(String[] args) {
        // Convert array to list
        String[] array = {"apple", "banana", "cherry", "date"};
        List<String> list = Arrays.asList(array);

        System.out.println("Array to List:");
        for (String item : list) {
            System.out.println(item);
        }

        // Convert list to array
        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);

        Integer[] integerArray = integerList.toArray(new Integer[0]);

        System.out.println("List to Array:");
        for (Integer num : integerArray) {
            System.out.println(num);
        }
    }
}

