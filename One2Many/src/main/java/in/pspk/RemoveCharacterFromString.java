package in.pspk;


public class RemoveCharacterFromString {
   
        
    

    public static void main(String[] args) {
        String str = "Hello, World!";
        char charToRemove = 'o';
        for(int i = 0;i<=str.length()-1;i++) {
        	if(str.charAt(i)!=charToRemove) {
        		
                System.out.print(str.charAt(i)+" ");
        		
        	}
        }

        
        
    }
}
