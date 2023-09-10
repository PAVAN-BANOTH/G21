package in.pspk;

public class AutomorphicNumber {

	public static void main(String[] args) {
		// f the square of the given number ends with the same number itself. For example, 25, 76 are automorphic numbers because their square is 625 and 5776
		int num = 25;
		int sqNum = num*num;
		String numStr = Integer.toString(num);
        String squareStr = Integer.toString(sqNum);
        
        // Check if the square ends with the original number
        if (squareStr.endsWith(numStr)) {
            System.out.println(num + " is an automorphic number.");
        } else {
            System.out.println(num + " is not an automorphic number.");
        }
	}

}
