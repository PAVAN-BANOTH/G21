package in.pavan;
import java.lang.*;
public class FactorialOfNumber {

	public static void main(String[] args) {
		int a = 6,fact=1;
		for(int i = 1;i<=a;i++) {
			fact = fact*i;;
		}
		System.out.println("Factorial of"+a+"is"+fact);
		System.out.println("1st Random Number: " + Math.random());   

	}

}
