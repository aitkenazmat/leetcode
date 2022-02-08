package algorithms.array;

import java.util.LinkedList;
import java.util.List;

public class LargestSubstringBetweenTwoEqualCharacters {
    public static void main(String[] args) {
//        String s = "abca";
//        String s = "aa";
//        String s = "cbzxy";
//        String s = "aabcaa";
        String s = "scayofdzca";
//        String s = "mgntdygtxrvxjnwksqhxuxtrv";
        System.out.println(maxLengthBetweenEqualCharacters(s));
    }

    public static int maxLengthBetweenEqualCharacters(String s) {
        List<Integer> response = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            int m = maxLengthBetweenEqualCharacters(s, i);
            if (m != -1) {
                if (i != 0) {
                    response.add ((m-1) -i) ;
                } else {
                    response.add ( m-1) ;
                }
            }
        }
        return response.isEmpty()?  -1: response.stream().max(Integer::compare).get();
    }

    static int maxLengthBetweenEqualCharacters(String s, int index) {
        int response = -1;
        char c = s.charAt(index);
        for (int i = 0; i < s.length(); i++) {
            if (i != index) {
                if (s.charAt(i) == c) {
                    response = i;
                }
            }
        }
        return response;
    }
}
