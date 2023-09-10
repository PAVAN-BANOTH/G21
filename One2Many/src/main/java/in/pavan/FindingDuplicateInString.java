package in.pavan;

public class FindingDuplicateInString {
	public static void main(String[] args) {
		String str = "java";
		char[] str1 = str.toCharArray();
		for(int i = 0;i<str1.length;i++) {
			//boolean isDistinct = true;
			for(int j = i+1;j<str1.length;j++) {
				if(str1[i]==str1[j]) {
					System.out.println("Duplicate char are  :"+str1[j]);
				}
						
			}
			
		}
		

	}

}
