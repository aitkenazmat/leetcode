package algorithms.tree;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class DeepestLeavesSum {
  public static void main(String[] args) {
    TreeNode root = new TreeNode(50,
            new TreeNode(40,
                    new TreeNode(30,
                            new TreeNode(25),
                            new TreeNode(35)),
                    new TreeNode(45,
                            new TreeNode(44),
                            new TreeNode(48))),
            new TreeNode(60,
                    new TreeNode(59),
                    new TreeNode(61,
                            null,
                            new TreeNode(63)))
    );

//    TreeNode root = new TreeNode(10,
//            new TreeNode(8,
//                    null,
//                    new TreeNode(9)),
//            new TreeNode(11,
//                    new TreeNode(12),
//                    new TreeNode(13,
//                            null,
//                            new TreeNode(14, null, new TreeNode(20)))
//            )
//    );


//    TreeNode root = new TreeNode(68);

    System.out.println(deepestLeavesSum(root));
  }

  public static int deepestLeavesSum(TreeNode root) {
    Queue<TreeNode> queue  = new ArrayDeque<>();
    queue.add(root);

    int res = 0 ;
    while (!queue.isEmpty()) {
      int size = queue.size();
      int sum = 0;
      int depthMaxValue = 0;
      res = 0;
      for (int i = 0; i < size; i++) {
        TreeNode poll = queue.poll();
        if (poll.left == null && poll.right==null) {
          sum+=poll.val;
        }
        if (poll.left != null) {
          queue.add(poll.left);
        }
        if (poll.right != null) {
          queue.add(poll.right);
        }
      }
      depthMaxValue = sum;
      res = depthMaxValue;
    }

    return res;

  }
}
