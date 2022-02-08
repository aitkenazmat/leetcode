package algorithms.tree;

import java.util.*;

public class SubstringsOfSizeThreeWithDistinctCharacters {

    public static void main(String[] args) {

        System.out.println(countGoodSubstrings("xyzzaz"));
        System.out.println(countGoodSubstrings("aababcabc"));
    }

    public static int countGoodSubstrings(String s) {

        List<String> list  = new LinkedList<>();
        for (int i = 0; i < s.length()-2; i++) {
            StringJoiner sj = new StringJoiner("");
            sj.add(String.valueOf(s.charAt(i)));
            for (int j = i+1; j < i+3; j++) {
                sj.add(String.valueOf(s.charAt(j)));
            }
            list.add(sj.toString());
        }

        int count = 0;
        for (String w :  list) {
            if (distinct(w)) {
                count++;
            }
        }

        return count;
    }

    static boolean distinct(String w) {
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < w.length(); i++) {
            if (map.get(w.charAt(i))==null) {
                map.put(w.charAt(i),w.charAt(i));
            } else {
                return false;
            }
        }

        return true;
    }

}
