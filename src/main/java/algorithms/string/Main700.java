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

        TreeNode treeNode = searchBST(root,2);



        System.out.println(treeNode.val);
        System.out.println(treeNode.left.val);
        System.out.println(treeNode.right.val);
    }

    public static TreeNode searchBST(TreeNode root, int val) {

        if (root==null)
            return null;
        if (root.val == val)
            return root;

        if (val<root.val)
            return searchBST(root.left,val);
        else
            return searchBST(root.right,val);

    }

}
