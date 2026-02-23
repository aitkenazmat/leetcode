package algorithms.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main_113 {

    static List<List<Integer>> response = new ArrayList<>();
    public static void main(String[] args) {

        TreeNode treeNode = new TreeNode(5,
                new TreeNode(4, new TreeNode(11,
                        new TreeNode(7),
                        new TreeNode(2)), null),
                new TreeNode(8,
                        new TreeNode(13),
                        new TreeNode(4, new TreeNode(5), new TreeNode(1))));
        pathSum(treeNode, 22);
    }


    public static List<List<Integer>> pathSum(TreeNode root, int targetSum) {

        List<Integer> ans = new ArrayList<>();
        pathSum(root, targetSum, ans);

        return  response;
    }
    public static void pathSum(TreeNode root, int targetSum, List<Integer> list) {
        if (root != null) {
            list.add(root.val);
            if (root.left==null && root.right==null && targetSum- root.val==0) {
                response.add(new ArrayList<>(list));
            }

            pathSum(root.left, targetSum- root.val, list);
            pathSum(root.right, targetSum - root.val, list);
            list.remove(list.size()-1);
        }
    }
}
