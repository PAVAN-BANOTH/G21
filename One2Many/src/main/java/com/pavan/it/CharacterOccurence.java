package com.pavan.it;


import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.Scanner;

public class CharacterOccurence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();
        //character occurence program
        Map<Character, Long> charOccurrences = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character Occurrences in the string: " + charOccurrences);
     // Filter characters with duplicate occurrences
        Map<Character, Long> duplicateOccurrences = charOccurrences.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Characters with duplicate occurrences: " + duplicateOccurrences);
    }
}
