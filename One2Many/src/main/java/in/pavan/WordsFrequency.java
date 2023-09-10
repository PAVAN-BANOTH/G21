package in.pavan;


import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordsFrequency {
    public static void main(String[] args) {
        String input = "Hello Hi World Hi Pavan Pavan Pavan";
        String[] a = input.split("\\s+");
       
        Map<String, Long> wordFrequencyMap = Arrays.stream(a)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Word Frequencies: " + wordFrequencyMap);
    }
}

