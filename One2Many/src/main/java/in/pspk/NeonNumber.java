package in.pspk;

public class NeonNumber {

	public static void main(String[] args) {
		int num= 9;//9->9*9=81->8+1=9
		int product = num * num;
		int sum = 0;
		while(product != 0) {
			
			sum = sum + product % 10;
			product = product/10;
		}
		if(sum == num) {
			System.out.println("Neon Number");
		}else {
			System.out.println("Not a Neon Number");
		}
	}

}
