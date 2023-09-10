package in.pspk;



public class CountingNoOfDigitsInNumber {
    public static void main(String[] args) {
        int num = 4682;
        int count = 0;
        while(num > 1){
             num = num / 10;
            count++;
            
              
        }
        System.out.println("No Of Digits In The Given No  :"+count);
    	
        //Count sum of the digits
        int num1 = 846;
        int sum = 0;
        while(num1 > 1){
            sum = sum + num1 % 10;//6+4+8
            num1=num1/10;//84 6 0
           
             
       }
       System.out.println("Sum Of Digits In The Given No  :"+sum);
    }
}

