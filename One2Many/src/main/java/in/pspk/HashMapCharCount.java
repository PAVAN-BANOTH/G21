package in.pspk;

import java.util.*;

public class HashMapCharCount {
	public static void main(String[] args) {
		String str ="pavan banoth";
		Map<Character,Integer> map = new HashMap();
		char[] chars = str.toCharArray();
		for(char ch : chars) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				 int cnt=map.get(ch);
				 map.put(ch,cnt+1);//cnt ->count
			}
		
		
			
		}
		System.out.println(map);
		
		
        //###################
        map.forEach((key, value) -> {
            if (value > 1) {
                System.out.println( key + " = " + value);
            }
        });
	}

}
