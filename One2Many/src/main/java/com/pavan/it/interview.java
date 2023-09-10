package com.pavan.it;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;


public class interview {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hello", "World", "Java", "Stream");
        
        List<Character> lastCharactersList = stringList.stream()
                                                      .map(str -> str.charAt(str.length() - 1))
                                                      .collect(Collectors.toList());

        System.out.println(lastCharactersList); // Output: [o, d, a, m]
    }
}