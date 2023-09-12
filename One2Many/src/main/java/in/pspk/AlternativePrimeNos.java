package in.pspk;



public class AlternativePrimeNos {

    public static void main(String[] args) {
        int n = 50; // Change this to the specific number you want to find primes up to

        System.out.println("Prime numbers up to " + n + ":");
        
        for (int num = 2; num <= n; num++) {
            int count = 0;

            if (num > 1) {
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }

                if (count == 2) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
