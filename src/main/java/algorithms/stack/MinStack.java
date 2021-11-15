package algorithms.stack;

import java.util.Stack;

public class MinStack {

    Stack<Integer> stack;
    Stack<Integer> stackMin;

    public MinStack() {
        stack =  new Stack<>();
        stackMin = new Stack<>();
    }

    public void push(int val) {
        if (stackMin.empty() || val <= stackMin.peek()) {
            stackMin.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        if (stack.peek().equals(stackMin.peek())) {
            stackMin.pop();
        }
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return stackMin.peek();
    }
}
