package algorithms.tree;

public class SumofRootToLeafBinaryNumbers {

  static int summ=0;

  public static void main(String[] args) {
    TreeNode treeNode21 = new TreeNode(6);
    TreeNode treeNode22 = new TreeNode(7);

    TreeNode treeNode11 = new TreeNode(6);
    TreeNode treeNode12 = new TreeNode(7);

    TreeNode treeNode1 = new TreeNode(5,treeNode11,treeNode12);
    TreeNode treeNode2 = new TreeNode(5,treeNode21,null);
    System.out.println(isSameTree(treeNode1, treeNode2));
  }


  public static boolean isSameTree(TreeNode p, TreeNode q) {
    if (p!=null && q!=null) {
      if (p.val != q.val) {
        return false;
      } else {
        isSameTree(p.right, q.right);
        return isSameTree(p.left, q.left);
      }
    } else {
      if (p==null) {
        return false;
      }


      return true;
    }

  }

  public static int sumRootToLeaf(TreeNode root) {
    leaf(root, root.val);
    return summ;
  }

  private static void leaf(TreeNode root, int val){

    if (root==null) {
      return;
    }

    if(root.left ==null && root.right == null) {
      summ += val;
    }

    if(root.left != null)  {
      leaf(root.left, val * 2 + root.left.val);
    }

    if(root.right != null)  {
      leaf(root.right, val * 2 + root.right.val);
    }
  }
}
