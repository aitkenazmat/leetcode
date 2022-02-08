package algorithms.stack;

import java.util.Stack;

public class CustomStack {
    Stack<Integer> stack ;
    int size;


    public CustomStack(int maxSize) {
        size = maxSize;
        stack = new Stack<>();
    }

    public void push(int x) {
        if (stack.size() < size)
            stack.push(x);
    }

    public int pop() {
        if (stack.empty()) {
            return -1;
        } else {
            Integer peek = stack.peek();
            stack.pop();
            return peek;
        }
    }

    public void increment(int k, int val) {
        if (stack.size() < k) {
            for (int i = 0; i < stack.size(); i++) {
                stack.set(i, stack.get(i) + val);
            }
        } else {

            for (int i = 0; i < k; i++) {
                stack.set(i, stack.get(i) + val);
            }
        }
    }
}
