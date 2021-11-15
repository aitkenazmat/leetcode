package algorithms.stack;

import java.util.Stack;

public class MinimumAddtoMakeParenthesesValid {
    public static void main(String[] args) {
        String s1 = "())";
        String s2 = "(((";
        String s3 = "()";
        String s4 = "()))((";
        System.out.println(minAddToMakeValid(s1));
        System.out.println(minAddToMakeValid(s2));
        System.out.println(minAddToMakeValid(s3));
        System.out.println(minAddToMakeValid(s4));
    }

    public static int minAddToMakeValid(String s) {
        Stack<String> stack = new Stack<>();
        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push("(");
            } else {
                if (!stack.empty()) {
                    stack.pop();
                } else {
                    res++;
                }
            }
        }

        if (!stack.empty()) {
            return stack.size()+ res;
        } else {
            return res;
        }
    }
}
