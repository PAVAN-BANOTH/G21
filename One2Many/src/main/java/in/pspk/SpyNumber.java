package in.pspk;

public class SpyNumber {

	public static void main(String[] args) {
		int num=1124;//1+1+2+8=1*1*2*4
		int temp = num;
		int sum = 0;
		int product =1;
		while(num!=0) {
			int digit = num%10;
			sum =sum+digit;
			product = product*digit;
			num= num/10;
			
		}
		if(sum == product) {
			System.out.println("SpyNumber");
			
		}else {
			System.out.println("Not a SpyNumber");
		}

	}

}
