package algorithms;

import algorithms.string.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MyLinkedList {

  List<Integer> list;

  public MyLinkedList() {
    list = new ArrayList<>();
  }

  public int get(int index) {
    if (index >=0 && index <= list.size()-1) {
      return list.get(index);
    }
    return -1;
  }

  public void addAtHead(int val) {
    list.add(0, val);
  }

  public void addAtTail(int val) {
    list.add(val);
  }

  public void addAtIndex(int index, int val) {
    try {
      list.add(index,val);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }

  }

  public void deleteAtIndex(int index) {

    list.remove(index);
  }
}
