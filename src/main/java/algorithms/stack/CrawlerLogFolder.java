package algorithms.stack;

import java.util.Stack;

public class CrawlerLogFolder {

    public static void main(String[] args) {

//        String[]logs = new String[]{"d1/","d2/","../","d21/","./"};
//        String[]logs = new String[]{"d1/","d2/","./","d3/","../","d31/"};
        String[]logs = new String[]{"d1/","../","../","../"};
        System.out.println(minOperations(logs));
    }

    public static int minOperations(String[] logs) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < logs.length; i++) {
            if (logs[i].equals("../")) {
                if (!stack.empty()) {
                    stack.pop();
                }
            } else if (logs[i].equals("./")) {

            } else {
                stack.push(logs[i]);
            }
        }
        return stack.size();
    }
}
