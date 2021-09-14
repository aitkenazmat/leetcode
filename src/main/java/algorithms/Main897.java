package algorithms;

import java.util.LinkedList;
import java.util.List;

/*
*
* 897. Increasing Order Search Tree
* Given a tree, rearrange the tree in in-order so that
* the leftmost node in the tree is now the root of the tree,
* and every node has no left child and only 1 right child.
*
*
* */
public class Main897 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode rootLeft = root.left = new TreeNode(2);
        root.right = new TreeNode(7);

        rootLeft.left = new TreeNode(1);
        rootLeft.right = new TreeNode(3);
        increasingBST(root);
        //printTreeNode();
    }

    public static TreeNode increasingBST(TreeNode root) {

        java.util.List<Integer> result = new LinkedList<Integer>();
        increasing(root, result);

        TreeNode treeNode = new TreeNode(root.val);
        for (int i = 1; i < result.size() ; i++) {
            treeNode.right = new TreeNode(result.get(i));
            
        }

        return null;
    }

    static void increasing(TreeNode root, List<Integer> integerList){
        if (root==null)
            return ;
        integerList.add(root.val);
        increasing(root.left,integerList);
        increasing(root.right,integerList);
    }


    public static void printTreeNode(TreeNode treeNode){
        if (treeNode==null)
            return;
        System.out.println(treeNode.val);
        printTreeNode(treeNode.left);
        printTreeNode(treeNode.right);
    }
}
