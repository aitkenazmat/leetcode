package algorithms.array;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class StringMatchinginanArray {
    public static void main(String[] args) {
        System.out.println(stringMatching(new String[]{"mass", "as", "hero", "superhero"}));
        System.out.println(stringMatching(new String[]{"leetcode","et","code"}));
        System.out.println(stringMatching(new String[]{"blue","green","bu"}));
    }

    public static List<String> stringMatching(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
        List<String> res = new LinkedList<>();
        for (int i = 0; i < words.length; i++) {
            if (find(i, words)!=null) {
                res.add(words[i]);
                words[i] = "";
            }
        }
        return res;
    }

    public static String find(int index, String[]words) {
        String word = words[index];
        for (int i = 0; i < words.length; i++) {
            if (i!=index) {
                String compareWord = words[i];
                for (int j = 0; j < compareWord.length(); j++) {
                    if (compareWord.charAt(j) == word.charAt(0)) {
                        StringBuilder sb = new StringBuilder();
                        for (int k = j; k < compareWord.length(); k++) {
                            sb.append(compareWord.charAt(k));

                            if (sb.toString().length() == word.length()) {
                                if (sb.toString().equals(word)) {
                                    return word;
                                }
                            }
                        }
                        if (sb.toString().equals(word)) {
                            return word;
                        }
                    }
                }
            }
        }

        return null;
    }
}
