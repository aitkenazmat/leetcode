package algorithms.stack;

public class IncreasingOrderSearchTree {

    public static void main(String[] args) {


        TreeNode node4 = new TreeNode(1);
        TreeNode node5 = new TreeNode(7);
        TreeNode node6 = new TreeNode(9);

        TreeNode node1 = new TreeNode(2, node4, null);
        TreeNode node2 = new TreeNode(4);
        TreeNode node3 = new TreeNode(8, node5, node6);

        TreeNode rootLeft = new TreeNode(3, node1, node2);
        TreeNode rootRight = new TreeNode(6, null, node3);

        TreeNode root = new TreeNode(5, rootLeft, rootRight);
        System.out.println(increasingBST(root));
    }

    public static TreeNode increasingBST(TreeNode root) {

        if (root.left!=null) {
            TreeNode left = root.left;
            System.out.println(left.val);
            increasingBST(left);
        }


        do1(root);



        return root;
    }


    static void do1(TreeNode node){
        System.out.println("eee: " + node.val);
    }
}
