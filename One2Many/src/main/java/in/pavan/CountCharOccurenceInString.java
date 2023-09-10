package in.pavan;

public class CountCharOccurenceInString {

	public static void main(String[] args) {
		
		
		String str = "The Product Manager of the famous brand Parle";
		int  totalCount = str.length();
		int totalCountAfterRemoveing = str.replace("a", "").length();
		int count = totalCount-totalCountAfterRemoveing;
		
		System.out.println("No of Occurence of A is  :"+count);
		
		String str1 = str.replaceAll("\\s","");
		System.out.println("after removing white spaces  :"+str1);
		String str2 = "The Prod@#,,u!$ct;.+";
		str2 = str2.replaceAll("[^a-zA-Z0-9]","");
		System.out.println("after removing specialchars  :"+str2);
		
		
	}

}
