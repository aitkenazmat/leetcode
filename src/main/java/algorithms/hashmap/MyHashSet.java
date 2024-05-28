package algorithms.hashmap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyHashSet {
  List<Integer> list;

  public MyHashSet() {
    list = new LinkedList<>();
  }

  public void add(int key) {
    boolean exists = false;
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i)== key) {
        exists = true;
        break;
      }
    }
    if (!exists)
      list.add(key);
  }

  public void remove(int key) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i) == key) {
        list.remove(key);
        break;
      }
    }
  }

  public boolean contains(int key) {
    return list.contains(key);
  }
}
