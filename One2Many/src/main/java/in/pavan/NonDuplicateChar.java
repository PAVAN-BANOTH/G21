package in.pavan;

public class NonDuplicateChar {
	 public static void main(String args[])
	    {
	        String str ="java";
	        boolean flag = true;

	        for(char i :str.toCharArray())
	        {
	            // if current character is the last occurrence in the string
	            if (str.indexOf(i) == str.lastIndexOf(i))
	            {
	                System.out.println("Non-repeating character is: "+ i);
	                flag = false;
	                //break;//this print the first non rep char
	            }
	        }

	        if(flag)
	            System.out.println("There is no non repeating character in input string");
	    }

}
