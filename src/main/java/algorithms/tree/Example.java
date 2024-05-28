package algorithms.tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Example {



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

//    int summ1 = summRecursive(root);
//    int summ1 = summStack(root);
//    int summ1 = summQueue(root);
    List<Integer> integers = summLevel(root);

    System.out.println(integers.size());
  }

  static int summRecursive(TreeNode root) {
    int sum = root.val;

    if (root.left!=null) {
      sum+=summRecursive(root.left);
    }
    if (root.right!=null){
      sum+=summRecursive(root.right);
    }
    return sum;
  }

  static int summStack(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);

    int sum = 0;
    while (!stack.isEmpty()) {
      TreeNode node = stack.pop();
      System.out.println("val:" +node.val);
      sum += node.val;

      if (node.right!=null) {
        stack.add(node.right);
      }

      if (node.left!=null) {
        stack.add(node.left);
      }
    }
    return sum;
  }

  static int summQueue(TreeNode root) {
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);

    int sum = 0;
    while (!queue.isEmpty()) {
      TreeNode node = queue.poll();
      System.out.println("val:" +node.val);
      sum += node.val;

      if (node.right!=null) {
        queue.add(node.right);
      }

      if (node.left!=null) {
        queue.add(node.left);
      }
    }
    return sum;
  }

  static List<Integer> summLevel(TreeNode root){
    List<Integer> res = new ArrayList<>();
    Queue<TreeNode> nodes = new ArrayDeque<>();
    nodes.add(root);
    while (!nodes.isEmpty()) {
      int levelSumm = 0;
      int size = nodes.size();
      for (int i = 0; i < size; i++) {
        TreeNode poll = nodes.poll();
        levelSumm+=poll.val;

        if (poll.left != null) {
          nodes.add(poll.left);
        }

        if (poll.right != null) {
          nodes.add(poll.right);
        }
      }
      res.add(levelSumm);
    }
    return res;
  }
}
