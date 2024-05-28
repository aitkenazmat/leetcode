package algorithms.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class SecondMinimumNodeInaBinaryTree {
  public static void main(String[] args) {

    TreeNode treeNode = new TreeNode(5, new TreeNode(5), new TreeNode(6));
    System.out.println(findSecondMinimumValue(treeNode));
  }

  public static int findSecondMinimumValue(TreeNode root) {
    Queue<TreeNode> queue  = new LinkedList<>();
    queue.add(root);

    List<Integer> integers  = new ArrayList<>();
    while (!queue.isEmpty()) {
      int size = queue.size();
      for (int i = 0; i < size; i++) {
        TreeNode poll = queue.poll();
        if (poll.left!=null && poll.right!=null) {
          integers.add(poll.val);

        }
        if (poll.left != null) {
          queue.add(poll.left);
        }

        if (poll.right != null) {
          queue.add(poll.right);
        }
      }
    }

    if (integers.size() >= 2) {
      return integers.get(1);
    }


    return -1;
  }
}
