package algorithms;

import java.util.*;
import java.util.List;

/**
 *
 * 590. N-ary Tree Postorder Traversal
 * Created by WWW on 04.12.2018.
 */
public class Main590 {
    public static void main(String[] args) {

        Node root = new Node();

        Node children2 = new Node();
        Node children3 = new Node();
        Node children4 = new Node();
        Node children5 = new Node();
        Node children6 = new Node();

        root.val=1;
        children2.val=2;
        children3.val=3;
        children4.val=4;
        children5.val=5;
        children6.val=6;


        List<Node> nodeList1 = new LinkedList<Node>();
        nodeList1.add(children3);
        nodeList1.add(children2);
        nodeList1.add(children4);


        List<Node> nodeList2 = new LinkedList<Node>();
        nodeList2.add(children5);
        nodeList2.add(children6);

        root.children = nodeList1;
        children3.children = nodeList2;

        for (Integer i : postorder(root)) {
            System.out.println(i);
        }


    }




    public static java.util.List<Integer> postorder(Node root) {
        List<Integer> result = new LinkedList<Integer>();
        order(root,result);
        return result;
    }

    public static void order(Node root,List<Integer> result) {
        if (root == null) return;
        if (root.children != null) {
            for (Node child: root.children) {
                order(child, result);
            }
        }
        result.add(root.val);
    }
}



