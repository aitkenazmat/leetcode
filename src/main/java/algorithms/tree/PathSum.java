package algorithms.tree;


import java.util.Stack;

public class PathSum {

  public static void main(String[] args) {

//    TreeNode root = new TreeNode(1);
    TreeNode root = new TreeNode(5,
            new TreeNode(4,
                    new TreeNode(11,
                            new TreeNode(7),
                            new TreeNode(2)
                    ),
                    null
            ),
            new TreeNode(8,
                    new TreeNode(13),
                    new TreeNode(4,
                            null,
                            new TreeNode(5)
                    )
            )
    );
    System.out.println(hasPathSum(root, 22));

  }

  public static boolean hasPathSum(TreeNode root, int targetSum) {
    if (root == null) {
      return false;
    }

    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);
    while (!stack.isEmpty()) {
      TreeNode pop = stack.pop();

      if (pop.left == null && pop.right == null) {
        if (pop.val == targetSum) {
          return true;
        }
      } else {
        targetSum = targetSum-pop.val;
      }

      if (pop.right!=null){
        stack.add(pop.right);
      }

      if (pop.left!=null){
        stack.add(pop.left);
      }
    }

    return false;
  }

  public static boolean hasPathSum(TreeNode root, int targetSum, int sumPath) {
    if (root==null)
      return false;

    Stack<TreeNode> stack  = new Stack();
    stack.add(root);

    while (!stack.isEmpty()) {
      TreeNode pop = stack.pop();
      if (pop.left == null && pop.right == null) {
        int sumPath2= sumPath+pop.val;
        if (sumPath2 == targetSum) {
          return true;
        }
      } else {
        sumPath+=pop.val;
      }

      if (pop.right != null) {
        stack.add(pop.right);
      }

      if (pop.left != null ) {
        stack.add(pop.left);
      }
    }
    return false;
  }
}
