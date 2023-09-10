package com.pavan.it.java;

import java.util.Scanner;



public class PositiveNegativeSeries {
    public static void main(String[] args) {
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        
        for (int i = 1, a = 2; i <= n; i++, a *= 3) {
            if (i % 2 == 0) {
                sum -= a;
            } else {
                sum += a;
            }
        }
        
        System.out.println("Sum of the given series is: " + sum);
        
        sc.close();
    }
}


