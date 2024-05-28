package algorithms.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AverageofLevelsinBinaryTree {
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
    averageOfLevels(root);
  }

  public static List <Double> averageOfLevels(TreeNode root) {
    List <Double> response = new ArrayList<>();
    Queue<TreeNode> mainQueue = new ArrayDeque<>();
    mainQueue.add(root);
    while (!mainQueue.isEmpty()) {
      long summ = 0;
      long count = 0;
      Queue<TreeNode> queue = new ArrayDeque<>();
      while (!mainQueue.isEmpty()) {
        TreeNode node = mainQueue.poll();
        summ = summ + node.val;
        count++;

        if (node.left!=null) {
          queue.add(node.left);
        }

        if (node.right != null) {
          queue.add(node.right);
        }
      }

      mainQueue = queue;
      response.add(summ * 1.0 / count);
    }
    return response;
  }
}
