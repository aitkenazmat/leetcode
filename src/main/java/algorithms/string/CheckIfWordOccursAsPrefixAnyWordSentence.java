package algorithms.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CheckIfWordOccursAsPrefixAnyWordSentence {
    public static void main(String[] args) {
        System.out.println(isPrefixOfWord("hello from the other side", "they"));
    }

    public static int isPrefixOfWord(String sentence, String searchWord) {

        String[] split = sentence.split(" ");


        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < split.length; i++) {
            if ( split[i].length() >= searchWord.length()) {
                map.put(i, split[i]);
            }
        }


        List<Integer> res = new LinkedList<>();
        for ( Map.Entry<Integer, String> entry : map.entrySet()) {
            if (check(entry.getValue(), searchWord)) {
                res.add(entry.getKey());
            }
        }

        return !res.isEmpty() ? res.get(0) + 1 : -1;

    }

    public static boolean check(String word, String searchWord) {

        for (int i = 0; i < searchWord.length(); i++) {
            if (searchWord.charAt(i)!=word.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
