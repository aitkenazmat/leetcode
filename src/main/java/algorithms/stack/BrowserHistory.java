package algorithms.stack;

import java.util.*;

public class BrowserHistory {

    Stack<String> forwardStack;
    Stack<String> stack;

    public BrowserHistory(String homepage) {
        stack = new Stack<>();
        stack.push(homepage);

        forwardStack = new Stack<>();
    }

    public void visit(String url) {
        stack.push(url);
        forwardStack.clear();
    }

    public String back(int steps) {
        while(stack.size() > 1 && steps > 0){
            forwardStack.push(stack.pop());
            steps--;
        }
        return stack.peek();
    }

    public String forward(int steps) {
        while(forwardStack.size() > 0 && steps > 0){
            stack.push(forwardStack.pop());
            steps--;
        }
        return stack.peek();
    }
}
