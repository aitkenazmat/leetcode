package algorithms.string;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.StringJoiner;

public class CheckifOneStringSwapCanMakeStringsEqual {
    public static void main(String[] args) {
        System.out.println(areAlmostEqual("bank", "kanb"));
        System.out.println(areAlmostEqual("abcd", "dcba"));
    }


    public static boolean areAlmostEqual(String s1, String s2) {

        if (s1.equals(s2)) {
            return true;
        }

        boolean response = areAlmostEqual1(s1, s2);
        if (!response) {
           return areAlmostEqual1(s2, s1);
        }

        return response;

    }

    public static boolean areAlmostEqual1(String original, String str) {
        char[]chars = str.toCharArray();
        char c  = str.charAt(0);
        for (int i = 1; i < chars.length; i++) {
            chars[0] = chars[i];
            chars[i] = c;
            if (!eq(chars, original)) {
                chars[0] = c;
                chars[i] = str.charAt(i);
            } else {
                return true;
            }
        }
        return false;
    }


    static boolean eq(char[] chars, String original) {
        StringJoiner sj = new StringJoiner("");
        for (int i = 0; i < chars.length; i++) {
            sj.add(String.valueOf(chars[i]));
        }

       return original.equals(sj.toString());
    }
}
