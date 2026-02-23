package algorithms.array;

import java.util.HashMap;
import java.util.Map;

public class Main_2586 {

    public static void main(String[] args) {
        String[]words = new String[]{"hey","aeo","mu","ooo","artro"};
        vowelStrings(words, 1 , 4);
    }

    public static int vowelStrings(String[] words, int left, int right) {

        Map<Character,Character> vowelMap = new HashMap<>();
        vowelMap.put('a','a');
        vowelMap.put('e','e');
        vowelMap.put('i','i');
        vowelMap.put('o','o');
        vowelMap.put('u','u');


        int cnt = 0;
        for (int i = left; i <= right; i++) {
            String word = words[i];

            char first = word.charAt(0);
            char last = word.charAt(word.length() - 1);

            if (vowelMap.get(first) != null && vowelMap.get(last)!= null) {
                cnt++;
            }


        }
        return cnt;
    }
}
