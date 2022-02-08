package algorithms.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.StringJoiner;

public class WordDictionary {
    private List<Stack<String>> list ;
    public WordDictionary() {
        list = new LinkedList<>();
    }

    public void addWord(String word) {
        list.add(getStack(word));
    }

    public boolean search(String word) {
        Stack<String> stack = getStack(word);
        if (list.contains(stack)) {
            return true;
        } else {

            if(!hasPoint(word)) {
                return list.contains(getStack(word));
            } else {
                int wordLength = word.length();
                for (Stack<String> s :  list) {
                    if (s.size() == wordLength) {
                        Stack<String> stack1 = getStack(getString(s));
                        for (int i = 0; i < word.length(); i++) {
                            if (word.charAt(i) == 46) {
                                stack1.pop();
                            } else {
                                if (stack1.peek().equals(String.valueOf(word.charAt(i)))) {
                                    stack1.pop();
                                }
                            }
                        }
                        if (stack1.isEmpty()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private  Stack<String> getStack(String word) {
        Stack<String> stack = new Stack<>();
        for (int i = word.length()-1; i >= 0 ; i--) {
            stack.push(String.valueOf(word.charAt(i)));
        }
        return stack;
    }

    private  String getString(Stack<String> stack) {

        StringJoiner sj = new StringJoiner("");
        for (int i = stack.size()-1; i >=0 ; i--) {
            sj.add(stack.get(i));
        }

        return sj.toString();
    }

    private  boolean hasPoint(String w){

        boolean hasPoint = false;
        for (int i = 0; i < w.length(); i++) {
            if (w.charAt(i)==46) {
                return true;
            }
        }
        return hasPoint;
    }
}
