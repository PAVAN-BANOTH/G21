package in.pavan;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
public class LastCharInEachStr {

	public static void main(String[] args) {
		List<String> str = Arrays.asList("Apple","Banana","Mango");
		//List<Character> lastChar = str.stream().map(s->s.charAt(s.length()-1)).collect(Collectors.toList());
		//System.out.println("lastChar.."+lastChar);
		//
		for(String a:str) {
			if(!a.isEmpty()) {
				char lastChar = a.charAt(a.length()-1);
				System.out.println("lastChar  :"+lastChar);
			}else {
				System.out.println("String is Empty");
			}
			
		}
		
		

	}

}
