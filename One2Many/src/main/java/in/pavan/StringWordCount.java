package in.pavan;

public class StringWordCount {

	public static void main(String[] args) {
		String str = "The Product Manager of the famous brand Parle";
		String[] a = str.split(" ");
		int wordCount = a.length;
        
        System.out.println("Number of words: " + wordCount);
		for(String words :a) {
			System.out.print(words.length()+" ");
			
			
		}
		
		
	}

}
