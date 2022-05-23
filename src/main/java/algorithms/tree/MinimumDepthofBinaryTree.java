package algorithms.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class MinimumDepthofBinaryTree {
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

    System.out.println(minDepth(root));
  }

  public static int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);
    int depth = 1;
    while (!queue.isEmpty()) {

      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode poll = queue.poll();
        if (poll.left == null && poll.right == null) {
          return depth;
        }
        if (poll.left != null) {
          queue.add(poll.left);
        }

        if (poll.right != null) {
          queue.add(poll.right);
        }
      }
      depth++;
    }
    return depth;
  }
}
