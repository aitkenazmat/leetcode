package algorithms.stack;

import java.util.Stack;

public class MyQueue {

    Stack<Integer> stack1;
    Stack<Integer> stack2;


    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
//        if (stack2.empty()) {
//
//        } else {
//            int lastIndex = stack2.size()-1;
//            stack2.add(lastIndex+1, x);
//        }
        stack2.push(x);
        stack1.push(x);
    }

    public int pop() {
        stack2.pop();
        return stack1.pop();
    }

    public int peek() {
        return stack1.peek();
    }

    public boolean empty() {
        return stack1.size()==0;
    }

}
