package algorithms.array;

import algorithms.string.ListNode;

public class Main2807 {
  public static void main(String[] args) {

    ListNode head = new ListNode(18, new ListNode(6, new ListNode(10, new ListNode(3))));

    ListNode listNode = insertGreatestCommonDivisors(head);

    System.out.println(listNode);

  }

  public static ListNode insertGreatestCommonDivisors(ListNode head) {

    if (head == null || head.next == null) {
      return head;
    }

    ListNode currentNode = head;

    while (currentNode != null && currentNode.next != null) {

      int gcd = gcd(currentNode.val, currentNode.next.val);
      ListNode newGcdNode = new ListNode(gcd);//new
      newGcdNode.next = currentNode.next; //все что после currentNode вставляем в newGcdNode.next
      currentNode.next = newGcdNode; //

      currentNode = newGcdNode.next;

    }

    return head;


  }


  private static int gcd(int a, int b) {
    while (b != 0) {
      int temp = b;
      b = a % b;
      a = temp;
    }
    return a;
  }


}
