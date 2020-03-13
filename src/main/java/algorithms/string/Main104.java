package algorithms.string;

public class Main104 {
    public static void main(String[] args) {

        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);


        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;

        treeNode3.right = treeNode4;
        treeNode3.left = treeNode5;

        maxDepth(treeNode1);
    }


    public static int maxDepth(TreeNode root) {

        int count = 0;
        if (root.left!=null || root.right!=null) {
            count++;
        }

        maxDepth(root);
        return count;
    }

}
