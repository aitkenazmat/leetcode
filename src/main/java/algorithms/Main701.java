package algorithms;

/*
*
* 701. Insert into a Binary Search Tree
*
* */
public class Main701 {

    public static void main(String[] args) {

        TreeNode root = new TreeNode(4);
        TreeNode rootLeft = root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        rootLeft.left = new TreeNode(1);
        rootLeft.right = new TreeNode(3);

        TreeNode treeNode = insertIntoBST(root,5);
        printTreeNode(treeNode);





    }

    public static TreeNode insertIntoBST(TreeNode root, int val)  {
        if (root==null){
            root.val = val;
        }



        if (root.left==null) {
            //System.out.println("left = " + root.val);
            root.left = new TreeNode(val);
            return root;
        }

        if (root.right==null) {
            //System.out.println("right = " + root.val);
            root.right = new TreeNode(val);
            return root;
        }

        insertIntoBST(root.left,val);
        insertIntoBST(root.right,val);

        return root;
    }

    public static void printTreeNode(TreeNode treeNode){
        if (treeNode==null)
            return;
        System.out.println(treeNode.val);
        printTreeNode(treeNode.left);
        printTreeNode(treeNode.right);
    }

}
