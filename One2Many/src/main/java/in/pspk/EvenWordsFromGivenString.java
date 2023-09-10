package in.pspk;

public class EvenWordsFromGivenString {

    public static void main(String[] args) {
        
        String str = "India will be renamed as Bharath";
        String[] words = str.split(" "); // Split the string into words

        for (String word : words) {
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
