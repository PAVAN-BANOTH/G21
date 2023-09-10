package in.pspk;


import java.util.*;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String input = "programming";

        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each character
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());

        // Find the maximum and minimum occurring characters using collections
        Collections.sort(entryList, (entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        char maxChar = entryList.get(0).getKey();
        char minChar = entryList.get(entryList.size() - 1).getKey();

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Minimum occurring character: " + minChar);
        System.out.println("entryList occurring character: " + entryList);
    }
}
