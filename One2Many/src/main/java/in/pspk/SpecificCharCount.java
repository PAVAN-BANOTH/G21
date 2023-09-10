package in.pspk;


public class SpecificCharCount {

    public static void main(String args[]) {
         
        String input = "Todayyy is Monday"; //count number of "a" on this String.
     
        
     
        //counting occurrence of character with loop
        int charCount = 0;
        for(int i =0 ; i<input.length(); i++){
            if(input.charAt(i) == 'a'){
                charCount++;
            }
        }
        System.out.println("count of character 'a' on String: 'Today is Monday' using for loop  " + charCount);
     
        //a more elegant way of counting the occurrence of a character in String using the foreach loop
     
        charCount = 0; //resetting character count
        for(char ch: input.toCharArray()){
            if(ch == 'y'){
                charCount++;
            }
        }    
        System.out.println("count of character 'y' on String: 'Today is Monday' using for each loop  " + charCount);
    }
 
       
}