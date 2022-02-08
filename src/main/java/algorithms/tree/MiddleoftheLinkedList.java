package algorithms.tree;

import algorithms.string.ListNode;

public class MiddleoftheLinkedList {
    public static void main(String[] args) {
        ListNode head  = new ListNode(1);
//        ListNode node3 = new ListNode(3);
//        head.next = new ListNode(2, node3);
//
//
//        ListNode node6 = new ListNode(6);
//
//        ListNode node5 = new ListNode(5, node6);
//        node3.next = new ListNode(4, node5);


        System.out.println(middleNode(head));
    }

    public static ListNode middleNode(ListNode head) {

        if (head.next == null) {
            return head;
        }

        int count = count(head, 1);
        int mid = (count/2) +1;
        return middleNodeRecursive(head.next, mid, 1);
    }

    public static ListNode middleNodeRecursive(ListNode node, int middle, int counter) {
        ListNode next = node.next;
        if (next!=null) {
           counter++;
            if (counter == middle) {
                return node;
            } else {
                return middleNodeRecursive(next, middle, counter);
            }
        }

        return node;
    }

    public static int count(ListNode head, int count){

        ListNode next = head.next;
        if (next!=null) {
            count++;
            return count(next, count);
        }

        return count;
    }
}
