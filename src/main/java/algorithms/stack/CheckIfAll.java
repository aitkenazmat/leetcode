package algorithms.stack;

import java.util.Stack;

public class CheckIfAll {
    public static void main(String[] args) {
        System.out.println(checkString("aaabbb"));
        System.out.println(checkString("abab"));
        System.out.println(checkString("bbb"));
    }

    public static boolean checkString(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (i < s.length()-1 && c == 'b' && s.charAt(i+1) !='b') {
                return false;
            }
        }
        return true;
    }
}
