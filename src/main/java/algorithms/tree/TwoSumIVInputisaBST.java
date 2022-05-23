package algorithms.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class TwoSumIVInputisaBST {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(50,
            new TreeNode(40,
                    new TreeNode(30,
                            new TreeNode(25),
                            new TreeNode(35)),
                    new TreeNode(45,
                            new TreeNode(44),
                            new TreeNode(48))),
            new TreeNode(60,
                    new TreeNode(59),
                    new TreeNode(61,
                            null,
                            new TreeNode(63)))
    );

    System.out.println(findTarget(root, 81));
  }

  public static boolean findTarget(TreeNode root, int k) {
    List<Integer> numbers = new ArrayList<>();

    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    while (!queue.isEmpty()) {
      TreeNode poll = queue.poll();
      numbers.add(poll.val);

      if (poll.left != null) {
        queue.add(poll.left);
      }
      if (poll.right != null) {
        queue.add(poll.right);
      }
    }

    for (int i = 0; i < numbers.size(); i++) {
      int x1 = numbers.get(i);
      for (int j = i; j < numbers.size(); j++) {
        if (j != i) {
          int x2 = numbers.get(j);
          if (x1 + x2 == k) {
            return true;
          }
        }
      }
    }

    return false;
  }
}
