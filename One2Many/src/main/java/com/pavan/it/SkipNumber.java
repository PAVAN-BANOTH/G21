package com.pavan.it;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class SkipNumber {
	public static void main(String[] args) {
		int[] num = {7, 3, 2, 1, 4, 6, 5};
		int skipNum = 4;
		for(int i = 0;i<num.length;i++) {
			if(num[i]!=skipNum) {
				System.out.print(num[i]+" ");
				
			}
			
		}
		
		System.out.println("Using Collections");
		 List<Integer> numbers = Arrays.asList(12, 45, 47, 85, 65, 57);
		numbers.remove(Integer.valueOf(47));
		System.out.println("After Removing Numbers Are.."+numbers);
		List<String> strLenght = Arrays.asList("pavan","kalyan","bharath");
		List<Character> lastChar = strLenght.stream().map(str->str.charAt(1)).collect(Collectors.toList());
		System.out.println("lastCharacter..."+lastChar);
	}

}
