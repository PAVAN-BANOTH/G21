package in.pspk;

public class CapitalizeFirstLetter1 {

	public static void main(String[] args) {
		String str = "hello world";
		String[] words = str.split(" ");
		String finalStatement = "";
		for(String word : words) {
			char[] ch = word.toCharArray();
			char c = ch[0];
			String firstChar = String.valueOf(c).toUpperCase();
			String capitalWord = firstChar;
			for(int i = 1;i<ch.length;i++) {
				capitalWord = capitalWord + ch[i];
				
			}
			 finalStatement = finalStatement + capitalWord + " ";
			 
			
			
		}
		System.out.println("finalStatement  :"+finalStatement);

	}

}
