package algorithms.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        System.out.println(isValid("([{()()}{([])}])"));
    }

    public static boolean isValid(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push("(");
            } else if (s.charAt(i) == ')') {
                if (!stack.empty() && stack.peek().equals("(")) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '{') {
                stack.push("{");
            } else if (s.charAt(i) == '}') {
                if (!stack.empty() && stack.peek().equals("{")) {
                    stack.pop();
                } else {
                    return false;
                }
            } else if (s.charAt(i) == '[') {
                stack.push("[");
            } else if (s.charAt(i) == ']') {
                if (!stack.empty() && stack.peek().equals("[")) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
