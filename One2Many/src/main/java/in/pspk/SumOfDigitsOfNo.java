package in.pspk;

public class SumOfDigitsOfNo {

	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;
		while(num > 1) {
			sum = sum+num%10;
			num = num/10;
		}
		System.out.println("SumOfDigitsOfNo"+sum);

	}

}
