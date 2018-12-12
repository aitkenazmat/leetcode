package algorithms.string;

import java.util.LinkedList;
import java.util.List;

public class Main589 {
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

        for (Integer i : preorder(root)) {
            System.out.println(i);
        }
    }


    public  static  List<Integer> preorder(Node root) {
        List<Integer> result = new LinkedList<Integer>();
        order(root,result);
        return result;
    }

    public static void order(Node root,List<Integer> result) {
        if (root == null) return;

        result.add(root.val);

        if (root.children != null) {
            for (Node child: root.children) {
                order(child,result);
            }
        }
    }
}


