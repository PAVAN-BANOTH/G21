package in.pspk;


public class FirstLetterOfEachWordInTheGivenString {
    public static void main(String[] args) {
        String inputString = "This is a sample string with some words of different lengths";
        String[] words = inputString.split(" ");

        System.out.println("First letters of each word in the string:");
        for (String word : words) {
            if (!word.isEmpty()) {
                System.out.print(word.charAt(0)+" ");
            }
        }
    }
}
