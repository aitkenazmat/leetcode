package algorithms.tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class SumofNodeswithEvenValuedGrandparent {

  public static void main(String[] args) {

    TreeNode root  = new TreeNode(61,
            new TreeNode(13),
            new TreeNode(46,
                    new TreeNode(56,
                            new TreeNode(72),
                            null),
                    null
            )
    );

//    TreeNode root = new TreeNode(6,
//            new TreeNode(7,
//                    new TreeNode(2,
//                            new TreeNode(9),
//                            null),
//                    new TreeNode(7,
//                            new TreeNode(1),
//                            new TreeNode(4)
//                    )
//            ),
//            new TreeNode(8,
//                    new TreeNode(1),
//                    new TreeNode(3,
//                            null,
//                            new TreeNode(5)
//                    )
//            )
//    );


    System.out.println(sumEvenGrandparent(root));
  }

  public static int sumEvenGrandparent(TreeNode root) {
    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);

    int totalSum = 0;
    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {
        TreeNode poll = queue.poll();
        if (poll.val % 2 == 0) {
          totalSum+=sumOnlyEvenGrandparent(poll);
        }
        if (poll.left !=null) {
          queue.add(poll.left);
        }

        if (poll.right !=null) {
          queue.add(poll.right);
        }
      }
    }

    return totalSum;
  }


  public static int sumOnlyEvenGrandparent(TreeNode root) {

    Queue<TreeNode> queue = new ArrayDeque<>();
    queue.add(root);

    int sum = 0;
    int depth = 1;
    while (!queue.isEmpty()) {
      int size = queue.size();

      for (int i = 0; i < size; i++) {

        TreeNode poll = queue.poll();
        if (depth == 3) {
          sum+=poll.val;
        }

        if (poll.left !=null) {
          queue.add(poll.left);
        }

        if (poll.right !=null) {
          queue.add(poll.right);
        }
      }
      depth++;
    }

    return sum;
  }
}
