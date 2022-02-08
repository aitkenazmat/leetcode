package algorithms.string;

import java.util.HashMap;
import java.util.Map;

public class CheckifWordEqualsSummationofTwoWords {
    public static void main(String[] args) {

        System.out.println(isSumEqual("aaa", "a", "aaaa"));
    }

    public static boolean isSumEqual(String firstWord, String secondWord, String targetWord) {

        Map<Character,Integer> map = new HashMap<>();
        map.put('a', 0);
        map.put('b', 1);
        map.put('c', 2);
        map.put('d', 3);
        map.put('e', 4);
        map.put('f', 5);
        map.put('g', 6);
        map.put('h', 7);
        map.put('i', 8);
        map.put('j', 9);

        long first = get(firstWord,map);
        long second = get(secondWord,map);
        long target = get(targetWord,map);

        return first+second == target;
    }

    public static Long get(String  word, Map<Character,Integer> map ) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            stringBuilder.append(map.get(word.charAt(i)));
        }
        return Long.valueOf(stringBuilder.toString());
    }
}
