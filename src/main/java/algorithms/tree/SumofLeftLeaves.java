package algorithms.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class SumofLeftLeaves {
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

    System.out.println(sumOfLeftLeaves(root));
  }

  public static int sumOfLeftLeaves(TreeNode root) {
    Queue<TreeNode> queue  = new ArrayDeque<>();
    queue.add(root);

    int sum = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode poll = queue.poll();

        TreeNode leftNode = poll.left;
        if (leftNode != null) {
          if (leftNode.left == null && leftNode.right == null) {
            sum+=leftNode.val;
          }
          queue.add(leftNode);
        }

        TreeNode rightNode = poll.right;
        if (rightNode != null) {
          queue.add(rightNode);
        }
      }
    }
    return sum;
  }

}
