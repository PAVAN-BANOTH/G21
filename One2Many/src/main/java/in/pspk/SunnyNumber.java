package in.pspk;


		/*N=80 then N+1 will be 80+1=81, which is a perfect square of the number 9. Hence 80 is a sunny number.

Let's take another number 10.

Given, N=10 then N+1 will be 10+1=11, which is not a perfect square. Hence 10 is not a sunny number.*/
		
		
		public class SunnyNumber {
		    public static void main(String[] args) {
		        int num = 9; // Replace with your number

		        // Calculate the square root of the number
		        int nextNumber = (int) Math.sqrt(num);

		        // Calculate the square of the next number
		        int square = nextNumber * nextNumber;

		        // Check if the number is a Sunny number
		        if (square + 1 == num) {
		            System.out.println(num + " is a Sunny number.");
		        } else {
		            System.out.println(num + " is not a Sunny number.");
		        }
		    }
		}


