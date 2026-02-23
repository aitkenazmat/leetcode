package algorithms.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringJoiner;

public class Main_257 {

    static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        getS();

        TreeNode treeNode = new TreeNode(5,
                new TreeNode(4, new TreeNode(11,
                        new TreeNode(7),
                        new TreeNode(2)), null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, new TreeNode(5), new TreeNode(1))));


        binaryTreePaths(treeNode);
    }

    public static List<String> binaryTreePaths(TreeNode root) {

        func(root, "");
        return list;

    }

    public static void func(TreeNode root, String str) {
        if(root==null) return;

        if (root.left == null && root.right == null) {
            str+=root.val;
            list.add(new String(str));
        }





        func(root.left, str+root.val+"->");
        func(root.right, str+root.val+"->");
    }

    public static String getS(){
        return "s";
    }
}
