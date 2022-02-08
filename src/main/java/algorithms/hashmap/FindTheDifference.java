package algorithms.hashmap;

import java.util.Arrays;

public class FindTheDifference {

    public static void main(String[] args) {
        System.out.println(findTheDifference("dcba", "abced"));
    }

    public static char findTheDifference(String s, String t) {
        char[] achars = s.toCharArray();
        char[] tchars = t.toCharArray();
        Arrays.sort(achars);
        Arrays.sort(tchars);
        char r = 0;
        for (int i = 0; i < tchars.length; i++) {
            if (i < achars.length) {
                if (tchars[i] != achars[i]) {
                    r =  tchars[i];
                    break;
                }
            } else {
                return tchars[tchars.length-1];
            }
        }
        return r;
    }
}
