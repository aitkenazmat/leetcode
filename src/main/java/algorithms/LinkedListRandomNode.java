package algorithms;

import algorithms.string.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LinkedListRandomNode {

  List<Integer> list = new ArrayList<>();


  public LinkedListRandomNode(ListNode head) {
    ListNode currentNode = head;
    while (currentNode.next != null) {
      list.add(currentNode.val);
      currentNode = currentNode.next;
    }

    list.add(currentNode.val);
  }

  public int getRandom() {
    int rnd = new Random().nextInt(list.size());
    return list.get(rnd);
  }

}
