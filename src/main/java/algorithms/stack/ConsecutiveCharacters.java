package algorithms.stack;

import java.util.Stack;

public class ConsecutiveCharacters {


    public static void main(String[] args) {
//        System.out.println(maxPower("leetcode"));
//        System.out.println(maxPower("abbcccddddeeeeedcba"));
//        System.out.println(maxPower("triplepillooooow"));
//        System.out.println(maxPower("hooraaaaaaaaaaay"));
        System.out.println(maxPower("ttttttourrrrrrrristaaaatttttttttt"));
    }

    public static int maxPower(String s) {
        int max = 0;
        int start  = 0;
        char s1 = s.charAt(0);
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s1) {
                String substring = s.substring(start,i);
                if (substring.length() > max) {
                    max = substring.length();
                }
                start = i;
                s1 = s.charAt(i);
            }
        }

        return Math.max(s.substring(start).length(), max);

    }
}
