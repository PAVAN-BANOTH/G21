 package com.pavan.it;
import java.util.*;
import java.lang.*;

public class WithoutReverse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String...");
		String str = sc.nextLine();
		for(int i = str.length()-1;i >=0;i--) {
			System.out.print(str.charAt(i));
		}
		
	}

}
