package algorithms;

import algorithms.string.ListNode;

public class Main_2095 {

  public static void main(String[] args) {

    ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));
    deleteMiddle(head);
  }

  public static ListNode deleteMiddle(ListNode head) {

    int totalCount = getSize(head);
    int middle  = totalCount /2 ;

    ListNode currentNode  = head;
    while (currentNode.next != null) {
      currentNode = currentNode.next;
    }


    return null;

  }

  public static int getSize(ListNode head) {
    int c = 0;
    ListNode currentNode  = head;
    while (currentNode.next != null) {
      c++;
      currentNode = currentNode.next;
    }
    c++;
    return c;
  }
}
