package algorithms.hashmap;

public class CountVowelSubstringsString {

    public static void main(String[] args) {
        countVowelSubstrings("cuaieuouac");
    }

    public static int countVowelSubstrings(String word) {
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                System.out.print(word.charAt(j));
            }
            System.out.println("---");
        }

        return 0;
    }
}
