package algorithms.stack;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BuildanArrayWithStackOperations {

    public static void main(String[] args) {
        int[]target = new int[]{1,3};
        buildArray(target,3);
    }

    public static List<String> buildArray(int[] target, int n) {
        List<String> operations = new LinkedList<>();
        List<Integer> targets = new LinkedList<>();
        for (int i = 0; i < target.length; i++) {
            targets.add(target[i]);
        }

        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (targets.contains(i)) {
                operations.add("Push");
                index++;
            } else {
                operations.add("Push");
                operations.add("Pol");
            }
            if (index == target.length) {
                break;
            }
        }
        return operations;
    }
}
