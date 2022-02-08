package algorithms.stack;

import java.util.LinkedList;
import java.util.List;

public class MyStack {

    List<Integer> queue;

    public MyStack() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        Integer integer = queue.get(queue.size() - 1);
        queue.remove(queue.size() - 1);
        return integer;
    }

    public int top() {
        return queue.get(queue.size() - 1);
    }

    public boolean empty() {
        return queue.size()==0;
    }
}
