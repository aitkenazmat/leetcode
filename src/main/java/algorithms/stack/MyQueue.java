package algorithms.stack;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack;


    public MyQueue() {
        stack = new Stack<>();
    }

    public void push(int x) {

        if (stack.empty()) {
            stack.push(x);
        } else {
            for (int i = 0; i < stack.size(); i++) {

            }
        }

    }

}
