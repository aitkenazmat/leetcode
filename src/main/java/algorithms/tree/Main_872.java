package algorithms.tree;

import java.util.Stack;

public class Main_872 {
  public static void main(String[] args) {

  }

  public boolean leafSimilar(TreeNode root1, TreeNode root2) {
    String str1 =getLeaf(root1);
    String str2 =getLeaf(root2);
    System.out.println(str1);
    System.out.println(str2);
    return str1.equals(str2);
  }

  static String getLeaf(TreeNode root){
    Stack<TreeNode> stack = new Stack<>();
    stack.add(root);
    StringBuilder res = new StringBuilder();
    while (!stack.isEmpty()) {

      TreeNode pop = stack.pop();
      if (pop.left==null && pop.right==null) {
        res.append(pop.val);
        res.append("_");
      }
      if (pop.right!=null) {
        stack.add(pop.right);
      }

      if (pop.left!=null) {
        stack.add(pop.left);
      }
    }
    return res.toString();
  }
}
