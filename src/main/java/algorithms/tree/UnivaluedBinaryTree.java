package algorithms.tree;

import java.util.Stack;

public class UnivaluedBinaryTree {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(1,
            new TreeNode(1,
                    new TreeNode(1,
                            new TreeNode(1),
                            new TreeNode(1)),
                    new TreeNode(1,
                            new TreeNode(1),
                            new TreeNode(1))),
            new TreeNode(1,
                    new TreeNode(1),
                    new TreeNode(1,
                            null,
                            new TreeNode(1)))
    );

    System.out.println(isUnivalTree(root));
  }


  public static boolean isUnivalTree(TreeNode root) {
    return isUnivalTree(root, root.val);
  }

  public static boolean isUnivalTree(TreeNode root, int compareValue) {
    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);
    while (!stack.isEmpty()) {
      TreeNode treeNode = stack.pop();
      if (treeNode.val != compareValue) {
        return false;
      }

      if (treeNode.right != null) {
        stack.add(treeNode.right);
      }

      if (treeNode.left != null) {
        stack.add(treeNode.left);
      }
    }
    return true;
  }
}
