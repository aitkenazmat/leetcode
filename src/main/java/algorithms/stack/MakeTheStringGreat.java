package algorithms.stack;

import java.util.Stack;

public class MakeTheStringGreat {
    public static void main(String[] args) {
//        String s = "leEeetcode";
//        String s = "abBAcC";
//        String s = "s";
        String s = "Pp";
        System.out.println(makeGood(s));
    }

    public static String makeGood(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            String compareStr = String.valueOf(s.charAt(i));
            if (!stack.empty()) {
                char c = compareStr.charAt(0);
                if (c <=90) {
                    char c1 = stack.peek().charAt(0);
                    if (c1 - c == 32) {
                        stack.pop();
                    } else {
                        stack.push(compareStr);
                    }
                } else {
                    char c1 = stack.peek().charAt(0);
                    if (c - c1  == 32) {
                        stack.pop();
                    } else {
                        stack.push(compareStr);
                    }
                }
            } else {
                stack.push(compareStr);
            }
        }

        if (!stack.empty()) {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < stack.size(); i++) {
                sb.append(stack.get(i));
            }
            return sb.toString();
        } else {
            return "";
        }
    }
}
