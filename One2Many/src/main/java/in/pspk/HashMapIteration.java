package in.pspk;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapIteration {
    public static void main(String[] args) {
        // Create a HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Alice", 25);
        hashMap.put("Bob", 30);
        hashMap.put("Charlie", 35);

        // Method 1: Using keySet() and for-each loop to iterate over keys
        System.out.println("Method 1: Iterate over keys using keySet():");
        for (String key : hashMap.keySet()) {
            System.out.println("Key: " + key);
        }
        

        // Method 2: Using values() and for-each loop to iterate over values
        System.out.println("\nMethod 2: Iterate over values using values():");
        for (Integer value : hashMap.values()) {
            System.out.println("Value: " + value);
        }
        

        // Method 3: Using entrySet() and for-each loop to iterate over key-value pairs
        System.out.println("\nMethod 3: Iterate over key-value pairs using entrySet():");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        

        // Method 4: Using forEach() and Lambda expression (Java 8+)
        System.out.println("\nMethod 4: Iterate over key-value pairs using forEach() and Lambda (Java 8+):");
        hashMap.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
        

        // Method 5: Using Iterator
        System.out.println("\nMethod 5: Iterate over key-value pairs using Iterator:");
        Iterator<Entry<String, Integer>> iterator = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
        
     // Method 6: Using Stream API (Java 8+)
        System.out.println("\nMethod 6: Iterate over key-value pairs using Stream API (Java 8+):");
        hashMap.entrySet().stream().forEach(entry -> {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        });
        
     // Method 7: Iterate over key-value pairs using parallel Stream (Java 8+)
        System.out.println("\nMethod 7: Iterate over key-value pairs using parallel Stream (Java 8+):");
        hashMap.entrySet().parallelStream().forEach(entry -> {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        });
        
        
     // Method 9: Using forEach method (Java 8+)
        System.out.println("\nMethod 9: Iterate over key-value pairs using forEach method (Java 8+):");
        hashMap.forEach((key, value) -> {
            System.out.println("Key: " + key + ", Value: " + value);
        });
        // Method 10: Using while loop and Iterator
        System.out.println("\nMethod 10: Iterate over key-value pairs using a while loop and Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator1 = hashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

