package in.pavan;

public class ReverseString2 {

	public static void main(String[] args) {
		String str = "Springboot and Microservices";
		//char[] str1 = str.toCharArray();
		for(int i = str.length()-1;i>=0;i--) {
			System.out.print(" "+str.charAt(i));
		}
		

	}

}
