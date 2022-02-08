package algorithms.stack;

import java.util.Stack;

public class ScoreofParentheses {
    public static void main(String[] args) {
//        System.out.println(scoreOfParentheses("(()(()))"));
//        System.out.println(scoreOfParentheses("()()"));
//        System.out.println(scoreOfParentheses("(())"));
//        System.out.println(scoreOfParentheses("(()())"));
//        System.out.println(scoreOfParentheses("()"));
        System.out.println(scoreOfParentheses("()(())"));
    }

    public static int scoreOfParentheses(String s) {
        boolean hasInner = hasInner(s);
        Stack<String> stack = new Stack<>();
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && s.charAt(i+1) == ')') {
                total++;
            } else if (s.charAt(i) == '(' && s.charAt(i+1) == '(') {
                stack.push("(");
            } else {
                if (hasInner) {
                    if (stack.size() > 1 ) {
                        stack.pop();
                        total++;
                    }
                } else {
                    stack.pop();
                    total++;
                }
            }
        }

        return  hasInner ? 2 * total : total;
    }


    public static boolean hasInner(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' && s.charAt(i+1) == '(') {
                return true;
            }
        }
        return false;
    }
}
