package algorithms.string;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbaca"));
//        System.out.println(removeDuplicates("azxxzy"));
//        System.out.println(removeDuplicates("azamat"));
//        System.out.println(removeDuplicates("aababaab"));
    }

    public static String removeDuplicates(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.empty() && stack.peek().equals(String.valueOf(s.charAt(i)))) {
                stack.pop();
            } else {
                stack.push(String.valueOf(s.charAt(i)));
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String st :stack) {
            sb.append(st);
        }
        return sb.toString();
    }

}
