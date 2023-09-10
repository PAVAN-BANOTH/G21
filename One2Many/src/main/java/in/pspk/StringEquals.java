package in.pspk;

public class StringEquals {

	public static void main(String[] args) {
		String str = "Pavan";
		String str1 = "Pavan";
		System.out.println(str.equals(str1));
		System.out.println(str.equalsIgnoreCase(str1));
		System.out.println(str.compareTo(str1));
		System.out.println(str.compareToIgnoreCase(str1));
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		System.out.println("Char at 4th index is :"+str.charAt(4));
		


	}

}
