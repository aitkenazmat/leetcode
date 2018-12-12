package algorithms.string;

/**
 *
 * 700. Search in a Binary Search Tree
 *
 * */
public class Main700 {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        TreeNode root1 = new TreeNode(2);
        TreeNode root2 = new TreeNode(7);
        TreeNode root3 = new TreeNode(1);
        TreeNode root4 = new TreeNode(3);

        root.left=root1;
        root.right = root2;

        root1.left = root3 ;
        root1.right = root4;

        searchBST(root,2);
    }

    public static TreeNode searchBST(TreeNode root, int val) {

        TreeNode res = new TreeNode(-6);

        search(root, res,val);

        return null;
    }


    public  static void  search(TreeNode treeNode, TreeNode res, int seachInt){

        if (treeNode==null) return;

        if (treeNode.val != seachInt) {

            if (treeNode.left.val!= seachInt) {

            } else {
                res.val = seachInt;
                res.left.val = treeNode.left.val;
                res.right.val = treeNode.right.val;
            }

            if (treeNode.right.val!=seachInt) {

            } else {
                res.val = seachInt;
                res.left.val = treeNode.left.val;
                res.right.val = treeNode.right.val;
            }

        } else {
            res.val = seachInt;
            res.left.val = treeNode.left.val;
            res.right.val = treeNode.right.val;
        }
    }
}
