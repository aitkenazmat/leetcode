package algorithms.tree;

public class SumOfRootToLeafBinaryNumbers {
    public static void main(String[] args) {

        TreeNode r1 = new TreeNode(7);
        TreeNode r2 = new TreeNode(2);

        TreeNode root = new TreeNode(4, r2, r1);

        TreeNode treeNode = insertIntoBST(null, 5);
        System.out.println(treeNode);
    }


    public static TreeNode insertIntoBST(TreeNode root, int val) {
        if (root != null) {
            if (root.val < val) {
                if (root.right != null) {
                    insertIntoBST(root.right, val);
                } else {
                    TreeNode node =  new TreeNode(val);
                    root.right = node;
                }

            } else {
                if (root.left != null) {
                    insertIntoBST(root.left, val);
                } else {
                    TreeNode node =  new TreeNode(val);
                    root.left = node;
                }

            }
        } else {
            TreeNode treeNode = new TreeNode(val);
            return treeNode;
        }

        return root;

    }


    public static TreeNode searchBST(TreeNode root, int val) {

        if (root==null || root.val == val) {
            return root;
        } else {
            if (root.val > val) {
               return searchBST(root.left, val);
            }  else {
                return searchBST(root.right, val);
            }
        }
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
