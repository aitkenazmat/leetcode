package algorithms.tree;

public class MaximumDepthofBinaryTree {

  public static void main(String[] args) {
    TreeNode r8 = new TreeNode(1);
    TreeNode r6 = new TreeNode(2, r8, null);
    TreeNode r7 = new TreeNode(4);

    TreeNode r4 = new TreeNode(7);
    TreeNode r5 = new TreeNode(9);

    TreeNode r3 = new TreeNode(8, r4, r5);

    TreeNode r1 = new TreeNode(3, r6, r7);
    TreeNode r2 = new TreeNode(6, null, r3);


    TreeNode treeNode = new TreeNode(5, r1, r2);


    System.out.println(maxDepth(treeNode));
  }


  public static int maxDepth(TreeNode root) {

    if(root == null) {
      return 0;
    }
    int left = maxDepth(root.left);
    int right = maxDepth(root.right);

    return Math.max(left, right) + 1;
  }

  public static int maxDepth(TreeNode root, int depth) {
    if (root!=null) {
      if (root.right != null && root.left != null) {
        depth++;
        maxDepth(root.right, depth);
        return maxDepth(root.left, depth);
      } else if (root.right != null) {
        depth++;
        return maxDepth(root.right, depth);
      } else {
        depth++;
        return maxDepth(root.left, depth);
      }
    }

    return depth;

  }
}
