package com.pavan.it;

public class CopyArrayToAnother {

	public static void main(String[] args) {
		int[] a = new int[] {2,3,4,5,7};
		int[] b = new int[a.length];
		for(int i = 0;i<a.length;i++) {
			 b[i] =   a[i];
			 System.out.print(" "+b[i]);
		}
			
		}
}
