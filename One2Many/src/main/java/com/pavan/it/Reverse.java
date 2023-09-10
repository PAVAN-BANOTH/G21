package com.pavan.it;

import java.util.*;
import java.lang.*;

public class Reverse {
	public static void main(String[] args) {
	
	String str = "pavan";
	String reversedString = new StringBuilder(str).reverse().toString();
	System.out.println(reversedString);
	if(str.equals(reversedString)) {
	System.out.println("String is  plyndrom");
	}else {
		System.out.println("String is not plyndrom");
	}
	}
	
	

}
