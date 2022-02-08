package algorithms.string;

public class MaximumNumberofWordsYouCanType {
    public static void main(String[] args) {


        canBeTypedWords("hello world", "ad");

    }

    public static int canBeTypedWords(String text, String brokenLetters) {
        String[] split = text.split(" ");

        int totalSum = 0;
        for (int i = 0; i < split.length; i++) {
            String word = split[i];
            if (canBeTyped(word, brokenLetters)) {
                totalSum++;
            }
        }

        return totalSum;
    }

    public static boolean canBeTyped(String word, String brokenLetters) {
        boolean can = true;
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < brokenLetters.length(); j++) {
                if (word.charAt(i) == brokenLetters.charAt(j)) {
                    return false;
                }
            }
        }
        return can;
    }
}
