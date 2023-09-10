package com.pavan.it;


import java.util.*;



	import java.util.*;
	import java.util.function.Function;
	import java.util.stream.Collectors;

	public class NewFreqMap {
	    public static void main(String[] args) {
	        Integer[] a = {12, 13, 44, 1, 2, 3, 56, 34, 44};
	        List<Integer> num = Arrays.asList(a);


	        Map<Integer, Long> frequencyMap = num.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	        System.out.println("frequencyMap  :"+frequencyMap);


	    }
	}

