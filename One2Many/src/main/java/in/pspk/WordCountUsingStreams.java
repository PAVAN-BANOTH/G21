package in.pspk;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCountUsingStreams {
    public static void main(String[] args) {
        String inputString = "This is a sample string. This string has some words.";

        Map<String, Long> wordCountMap = Stream.of(inputString.split("\\s+"))
                .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase())
                .filter(word -> !word.isEmpty())
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println("Word count in the string:");
        wordCountMap.forEach((word, count) -> System.out.println(word + ": " + count));
    }
}

