package algorithms.array;

import java.util.LinkedList;
import java.util.List;

public class NumberofStringsThatAppearasSubstringsinWord {

    public static void main(String[] args) {
        String[] patterns = new String[]{"a","abc","bc","d"};
        String word = "abc";
        System.out.println(numOfStrings(patterns, word));
    }

    public static  int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (int i = 0; i < patterns.length; i++) {
            if (word.contains(patterns[i])) {
                count++;
            }
        }
        return count;
    }
}
