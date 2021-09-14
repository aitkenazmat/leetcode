package algorithms.string;

import java.util.ArrayList;
import java.util.List;

public class WordPattern {
    public static void main(String[] args) {

        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] s1 = s.split(" ");

        if (s1.length != pattern.length()) {
            return false;
        }

        for (int i = 0; i < pattern.length() ; i++) {
            List<Integer> indexces = getIndexces(pattern, i);
            String word = s1[indexces.get(0)];


            int count = 0;
            for (int j = 0; j < s1.length ; j++) {
                if (word.equals(s1[j])) {
                    count++;
                }
            }

            if (count>indexces.size()) {
                return false;
            }


            for (int j = 1; j < indexces.size() ; j++) {
                if (!s1[indexces.get(j)].equals(word)) {
                    return false;
                }
            }


        }
        return true;
    }


    static List<Integer> getIndexces(String pattern, int currentIndex) {
        List<Integer> index = new ArrayList<>();
        index.add(currentIndex);
        char currentChar = pattern.charAt(currentIndex);
        for (int i = 0; i < pattern.length(); i++) {
            if (i!=currentIndex) {
                if (pattern.charAt(i) == currentChar) {
                    index.add(i);
                }
            }

        }

        return index;
    }
}
