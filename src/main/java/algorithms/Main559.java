package algorithms;

import java.util.LinkedList;
import java.util.List;

public class Main559 {
    public static void main(String[] args) {

        Node root = new Node();

        Node children2 = new Node();
        Node children3 = new Node();
        Node children4 = new Node();
        Node children5 = new Node();
        Node children6 = new Node();
        Node children7 = new Node();
        Node children8 = new Node();
        Node children9 = new Node();
        Node children10 = new Node();

        root.val=1;
        children2.val=2;
        children3.val=3;
        children4.val=4;
        children5.val=5;
        children6.val=6;
        children7.val=7;
        children8.val=8;
        children9.val=9;
        children10.val=10;


        java.util.List<Node> nodeList1 = new LinkedList<Node>();
        nodeList1.add(children3);
        nodeList1.add(children2);
        nodeList1.add(children4);


        List<Node> nodeList2 = new LinkedList<Node>();
        nodeList2.add(children5);
        nodeList2.add(children6);

        List<Node> nodeList5 = new LinkedList<Node>();
        nodeList5.add(children9);
        children5.children = nodeList5;

        List<Node> nodeList9 = new LinkedList<Node>();
        nodeList9.add(children10);
        children8.children = nodeList9;


        List<Node> nodeList4 = new LinkedList<Node>();
        nodeList4.add(children7);
        children4.children = nodeList4;


        List<Node> nodeList7 = new LinkedList<Node>();
        nodeList7.add(children8);
        children7.children = nodeList7;



        root.children = nodeList1;
        children3.children = nodeList2;


        System.out.println(maxDepth(root));
    }

    public static int maxDepth(Node root) {
        if (root==null) return 0;
        int max = 0;
        if (root.children!=null) {
            for (Node n : root.children) {
                int value = maxDepth(n);
                System.out.println(value);
                if (value > max) {
                    max = value;
                }
            }
        }
        return max+1;
    }
}
