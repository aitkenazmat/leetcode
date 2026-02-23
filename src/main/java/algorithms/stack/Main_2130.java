package algorithms.stack;

import algorithms.string.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main_2130 {

  public static void main(String[] args) {
    int size = 6;
    // 0 1 2 3 4 5
    // 1 2 3 4 5 6

//    System.out.println((size -1) - 0);
//    System.out.println((size -1) - 1);
//    System.out.println((size -1) - 2);2

    ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(30, new ListNode(40, new ListNode(5, new ListNode(6))))));
    System.out.println(pairSum(listNode));
  }

  public static int pairSum(ListNode head) {


    List<ListNode> list = pack(head);

    int pairMaxSum = list.get(0).val + list.get(list.size()-1).val;

            Stack<Pair> stack = new Stack<>();
    stack.add(new Pair(0, (list.size()-1) - 0));
    for (int i = 1; i < list.size(); i++) {
      ListNode listNode = list.get(i);
      Pair peek = stack.peek();
      if (peek.getVal() == i) {
        ListNode listNode1 = list.get(peek.key);
        if ((listNode.val + listNode1.val) > pairMaxSum) {
          pairMaxSum = listNode.val + listNode1.val;
        }
        stack.pop();
      } else {
        stack.add(new Pair(i, (list.size()-1) - i));
      }
    }

    return pairMaxSum;
  }


  public static List<ListNode> pack(ListNode head) {
    List<ListNode> list = new ArrayList<>();
    ListNode currentNode = head;
    while (currentNode.next != null) {
      list.add(currentNode);
      currentNode = currentNode.next;
    }

    list.add(currentNode);

    return list;
  }

  static class Pair {
    int key;
    int val;

    public Pair(){

    }

    public Pair(int k, int v){
      this.key = k;
      this.val = v;
    }

    int getVal() {
      return this.val;
    }

    int getKey() {
      return this.key;
    }
  }
}
