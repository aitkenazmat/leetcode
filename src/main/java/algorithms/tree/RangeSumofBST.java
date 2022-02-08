package algorithms.tree;

public class RangeSumofBST {

    static int sum;

    public static void main(String[] args) {

        TreeNode t1 = new TreeNode(2,new TreeNode(4), new TreeNode(5));
        TreeNode t2 = new TreeNode(3);

        TreeNode treeNode = new TreeNode(1,t1, t2);

        System.out.println(rangeSumBST(treeNode, -1, 20));

    }

    public static int rangeSumBST(TreeNode root, int low, int high) {
        sum=0;
        rangeSumBSTRecursion(root, low, high );

        return sum;
    }

    public static void rangeSumBSTRecursion(TreeNode root, int low, int high) {

        if(root==null)
            return;

        if (root.val >=low && root.val <=high) {
            sum = sum +root.val;
        }


        rangeSumBSTRecursion(root.left,low,high);
        rangeSumBSTRecursion(root.right,low,high);

    }
}
