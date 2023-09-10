package in.pspk;

public class CountEvenOddDigitsInGivenNo {
	public static void main(String[] args) {
		int num = 1234;
		int evenCount = 0;
		int oddCount = 0;
		while(num>1) {
			int rem=num%10;
			if(rem%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num=num/10;
		}
		System.out.println("evenCount"+evenCount);
		System.out.println("oddCount"+oddCount);
	}

}
