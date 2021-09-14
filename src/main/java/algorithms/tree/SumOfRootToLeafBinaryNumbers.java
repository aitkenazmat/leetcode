package algorithms.tree;

public class SumOfRootToLeafBinaryNumbers {
    public static void main(String[] args) {


        TreeNode rootRightLeft = new TreeNode(0);
        TreeNode rootRightRight = new TreeNode(1);
        TreeNode rootRight = new TreeNode(1,rootRightLeft,rootRightRight);


        TreeNode rootLeftRight = new TreeNode(1);
        TreeNode rootLeftLeft = new TreeNode(0);
        TreeNode rootLeft = new TreeNode(0, rootLeftLeft, rootLeftRight);


        TreeNode root = new TreeNode(1, rootLeft, rootRight);

        sumRootToLeaf(root);
    }


    public static int sumRootToLeaf(TreeNode root) {
        getRoot(root.right);
        getRoot(root.left);
        return 0;

    }

    public static void getRoot(TreeNode tree) {
        if (tree!= null)
            System.out.println(tree.val);
        if (tree.right!=null)
            getRoot(tree.right);

    }
}
