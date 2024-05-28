package algorithms.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IncreasingOrderSearchTree {

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
    increasingBST(treeNode);
  }


  public static TreeNode increasingBST(TreeNode root) {
    List<Integer> list = new ArrayList<>();
    getVal(root, list);
    Collections.sort(list, Integer::compareTo);
    TreeNode res = new TreeNode(list.get(0));
    setVal(res, list, 1 );
    return res;
  }


  public static void getVal(TreeNode treeNode,List<Integer> list) {
    if (treeNode!=null) {
      list.add(treeNode.val);
      if (treeNode.left!=null) {
        getVal(treeNode.left, list);
      }
      if (treeNode.right!=null) {
        getVal(treeNode.right, list);
      }
    }
  }

  public static void setVal(TreeNode root, List<Integer> list,  int index) {
    System.out.println(index);
    if (index <= list.size()-1) {
      if (root.val < list.get(index) ) {
        root.right = new TreeNode(list.get(index));
        ++index;

        setVal(root.right, list, index);
      }
    }


  }
}
