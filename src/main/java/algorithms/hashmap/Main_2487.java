package algorithms.hashmap;

import algorithms.string.ListNode;

import java.util.Arrays;

public class Main_2487 {

    public static void main(String[] args) {





        ListNode head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));
//        ListNode head = new ListNode(1, new ListNode(1, new ListNode(1, new ListNode(1))));
        removeNodes(head);
    }

    public static ListNode removeNodes(ListNode head) {
       if (head == null || head.next == null) {
           return head;
       }

       ListNode nextNode  = removeNodes(head.next);

       if (nextNode.val > head.val) {
           return nextNode;
       }

       head.next = nextNode;

       return head;
    }

    public static boolean remove(ListNode head, int val) {
        ListNode currentNode = head;
        while (currentNode.next != null) {

            if (currentNode.val > val) {
                return true;
            }
            currentNode = currentNode.next;
        }

        if (currentNode.val > val) {
            return true;
        }
        return false;
    }
}
