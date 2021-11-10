package algorithms.stack;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {

        String[]ops = new String[]{"5","2","C","D","+"};
        System.out.println(calPoints(ops));
    }

    public static int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < ops.length; i++) {
            try {
                int digit = Integer.parseInt(ops[i]);
                stack.push(digit);
            } catch (NumberFormatException e) {
                if ("C".equals(ops[i])) {
                    stack.pop();
                } else if ("D".equals(ops[i])) {
                    Integer peek = stack.peek();
                    stack.push(peek*2);
                } else if ("+".equals(ops[i])) {
                    Integer f = stack.get(stack.size() - 1);
                    Integer s = stack.get(stack.size() - 2);
                    stack.push(f+s);
                }
            }
        }


        int totalSum = 0;
        for (Integer i: stack) {
            totalSum+=i;
        }
        return totalSum;
    }
}
