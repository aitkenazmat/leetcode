package algorithms.string;

import java.util.StringJoiner;

public class RotateString {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String s, String goal) {
        int c = 0;
        return rotateString(s, goal, c);
    }

    public static boolean rotateString(String s, String goal, int c) {

        if (c >= s.length()) {
            return false;
        }

        char first = s.charAt(0);
        StringJoiner sj = new StringJoiner("");
        for (int i = 1; i < s.length(); i++) {
            sj.add(String.valueOf(s.charAt(i)));
        }
        sj.add(String.valueOf(first));

        if (sj.toString().equals(goal)) {
            return true;
        }
        c++;
        return rotateString(sj.toString(), goal, c);
    }
}
