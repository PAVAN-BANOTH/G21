package in.pavan;

public class SeperatingEvenOddDigitsInNo {
	public static void main(String[] args) {
		int num = 4568;
		int evenCount = 0;
		int oddCount = 0;
		int evenSum = 0;
		while(num > 1) {
			int rem = num%10;
			if(rem%2==0){
				evenCount++;
				evenSum = evenSum + rem;
				
				
			}else {
				oddCount++;
				
			}
			num=num/10;
		}
		System.out.println("evenSum :"+evenSum);
		System.out.println("oddCount"+oddCount);
		System.out.println("evenCount"+evenCount);
	}

}
