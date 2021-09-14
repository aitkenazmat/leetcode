package algorithms.string;

import java.util.HashSet;
import java.util.Set;

public class NumberofDifferentIntegersinaString {
    public static void main(String[] args) {

//        String s = "a1b01c001aa";
        String s = "a1b01c001";

        System.out.println(numDifferentIntegers(s));
    }

    public static int numDifferentIntegers(String word) {

        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] > 65) {
                chars[i] = 95;
            }
        }

        Set<String> integers = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] <= 65) {
                if (chars[i]!= ' ') {
                    sb.append(chars[i]);
                }

            } else {
                if (sb.length() > 0) {
                    integers.add(sb.toString());
                }
                sb = new StringBuilder();
            }
        }
        if (sb.length() > 0) {
            integers.add(sb.toString());
        }


        return integers.size();
    }
}
