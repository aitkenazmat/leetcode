package algorithms.array;

import java.util.StringJoiner;

public class FindFirstPalindromicStringintheArray {

    public static void main(String[] args) {
        String[]words = new String[]{"abcd","car","ada","racecar","cool"};
        System.out.println(firstPalindrome(words));
    }

    public static String firstPalindrome(String[] words) {
        for (int i = 0; i < words.length; i++) {
            String word  = words[i];
            if (isPalindromic(word)) {
                return word;
            }
        }
        return "";
    }

    public static Boolean isPalindromic(String word ) {
        StringJoiner stringJoiner = new StringJoiner("");
        for (int i = word.length()-1; i >= 0; i--) {
            stringJoiner.add(String.valueOf(word.charAt(i)));
        }
        return word.equals(stringJoiner.toString());
    }
}
