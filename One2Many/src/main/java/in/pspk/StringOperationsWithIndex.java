package in.pspk;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.*;

public class StringOperationsWithIndex {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        System.out.println("Original list of strings: " + stringList);

        // Filter strings with even length
        List<String> evenLengthStrings = stringList.stream()
                .filter(str -> str.length() % 2 == 0)
                .toList();
        System.out.println("Strings with even length: " + evenLengthStrings);
        List<String> uppercaseList = stringList.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println("Uppercase strings: " + uppercaseList);

       

        // Join strings with a delimiter
        String joinedString = stringList.stream()
                .collect(Collectors.joining(", "));
        System.out.println("Joined string: " + joinedString);

        // Count the number of characters in all strings
        int totalCharacters = stringList.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Total characters in all strings: " + totalCharacters);

        // Find the longest string
        String longestString = stringList.stream()
                .max((s1, s2) -> s1.length() - s2.length())
                .orElse(null);
        System.out.println("Longest string: " + longestString);

        // Check if any string contains "apple"
        boolean containsApple = stringList.stream()
                .anyMatch(str -> str.contains("apple"));
        System.out.println("Contains 'apple': " + containsApple);
        
        
        
     // Count the number of characters in all strings
        int totalCharacters1 = stringList.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Total characters in all strings: " + totalCharacters1);

        // Find the longest string
        String longestString1 = stringList.stream()
                .max((s1, s2) -> s1.length() - s2.length())
                .orElse(null);
        System.out.println("Longest string: " + longestString1);

        // Check if any string contains "apple"
        boolean containsApple1 = stringList.stream()
                .anyMatch(str -> str.contains("apple"));
        System.out.println("Contains 'apple': " + containsApple1);

        // Count the number of strings containing 'e'
        long countStringsContainingE = stringList.stream()
                .filter(str -> str.contains("e"))
                .count();
        System.out.println("Number of strings containing 'e': " + countStringsContainingE);

        // Find the shortest string length
        int shortestStringLength = stringList.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);
        System.out.println("Shortest string length: " + shortestStringLength);

        // Remove duplicate characters from each string
        List<String> stringsWithoutDuplicates = stringList.stream()
                .map(str -> str.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()))
                .collect(Collectors.toList());
        System.out.println("Strings without duplicates: " + stringsWithoutDuplicates);
        
        // Count the number of characters in all strings
        int totalCharacters2= stringList.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println("Total characters in all strings: " + totalCharacters2);
        
        
        
     // Find the shortest string length
        int shortestStringLength1 = stringList.stream()
                .mapToInt(String::length)
                .min()
                .orElse(0);
        System.out.println("Shortest string length: " + shortestStringLength1);

        // Remove duplicate characters from each string
        List<String> stringsWithoutDuplicates1 = stringList.stream()
                .map(str -> str.chars().distinct().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining()))
                .collect(Collectors.toList());
        System.out.println("Strings without duplicates: " + stringsWithoutDuplicates1);
        
     // Replace 'a' with 'x' in each string
        List<String> replaceAWithXList = stringList.stream()
                .map(str -> str.replace('a', 'x'))
                .collect(Collectors.toList());
        System.out.println("Strings with 'a' replaced by 'x': " + replaceAWithXList);
        
     // Print last character of each string
        List<Character> lastCharList = stringList.stream()
                .map(str -> str.charAt(str.length() - 1))
                .collect(Collectors.toList());
        System.out.println("Last character of each string: " + lastCharList);

        // Reverse each string
        List<String> reversedList = stringList.stream()
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.toList());
        System.out.println("Reversed strings: " + reversedList);

    }

    }


