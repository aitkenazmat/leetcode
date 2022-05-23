package algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
  public static void main(String[] args) {

    TreeNode treeNode = new TreeNode();

    //inorderTraversal();
  }

  public static List<Integer> inorderTraversal(TreeNode root) {
    if (root==null)
      return new ArrayList<>();
    List<Integer> res = new ArrayList<>();
    return inorderTraversal(root,res );
  }

  public static List<Integer> inorderTraversal(TreeNode root, List<Integer> res) {
    if (root.left!= null) {
      inorderTraversal(root.left, res);
    }

    res.add(root.val);

    if (root.right!=null) {
      inorderTraversal(root.right,res);
    }

    return res;
  }
}
