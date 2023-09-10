package in.pspk;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LargestAndSmallestWordInString {

    public static void main(String[] args) {
        String str = "Spring And Microservice backend java developer"; // Fixed the input string
        String[] words = str.split(" "); // Split the string into words

        List<String> wordList = Arrays.asList(words);

        Optional<String> largestWord = wordList.stream()
                .max(Comparator.comparingInt(String::length));
        Optional<String> smallestWord = wordList.stream()
                .min(Comparator.comparingInt(String::length));

        largestWord.ifPresent(word -> System.out.println("Largest word: " + word));
        smallestWord.ifPresent(word -> System.out.println("Smallest word: " + word));
    }
}

