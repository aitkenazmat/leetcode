package algorithms.stack;

import java.util.*;

public class MaximumNestingDepthoftheParentheses {
    public static void main(String[] args) {
        String s1 = "(1+(2*3)+((8)/4))+1";
        String s2 = "(1)+((2))+(((3)))";
        String s3 = "1+(2*3)/(2-1)";
        String s4 = "1";
        System.out.println(maxDepth1(s1));
        System.out.println(maxDepth1(s2));
        System.out.println(maxDepth1(s3));
        System.out.println(maxDepth1(s4));
    }

    public static int maxDepth(String s) {


        Stack<Integer> stack = new Stack<>();

        Map<Integer,Integer> set  = new TreeMap<>(Integer::compareTo);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                sum = sum + 1;
                set.put(sum,sum);
            }

            if (s.charAt(i) == ')') {
                sum = sum -1;
                set.put(sum,sum);
            }
        }


        return !set.isEmpty() ? set.get(set.size()-1): sum;


    }


    public static int maxDepth1(String s) {


        Stack<String> stack = new Stack<>();
        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stack.push("(");
            }

            if (s.charAt(i) == ')') {
                if (!stack.empty()) {
                    if (stack.peek().equals("(")) {
                        stack.pop();
                        c++;
                    }
                }
            }
        }


        return c-1;


    }
}
