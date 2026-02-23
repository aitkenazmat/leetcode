package algorithms.hashmap;

import algorithms.string.ListNode;

import java.util.*;

public class Main_1452 {

  public static void main(String[] args) {

    pivotInteger(8);
  }
  public static List<Integer> peopleIndexes(List<List<String>> favoriteCompanies) {

    Map<String,Integer> map = new TreeMap<>();
    int idx = 0;
    for (List<String> f : favoriteCompanies) {
      Collections.sort(f);
      String key = "";
      for (int i = 0; i < f.size(); i++) {
        key+=f.get(i);
      }
      map.put(key, idx);
      idx++;
    }

    List<Integer> list = new ArrayList<>();
    for (Map.Entry<String,Integer> entry : map.entrySet()) {

      if (!exist(map, entry.getKey())) {
        list.add(entry.getValue());
      }
    }

    Collections.sort(list);
    return list;
  }

  public static boolean exist(Map<String,Integer> map, String key) {
    for (Map.Entry<String,Integer> entry : map.entrySet()) {
      if (!entry.getKey().equals(key)) {
        if (entry.getKey().contains(key)) {
          return true;
        }
      }
    }
    return false;
  }

  public static int partitionString(String s) {
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      Map<Character,Character> map = new TreeMap<>();
      char first = s.charAt(i);
      map.put(first,first);

      for (int j = i+1; j < s.length(); j++) {
        char second = s.charAt(j);
        if (map.get(second)==null) {
          map.put(second,second);
        } else {
          count++;
          i  = j-1;
          break;
        }
      }
    }
    return count+1;
  }


  public static int pivotInteger(int n) {

    if (n ==1) {
      return 1;
    }

    int a = 1;
    int x = -1;


    for (int i = 2; i < n; i++) {

      a+=i;

      int sum = 0;
      for (int j = i; j <= n; j++) {
        sum+=j;
      }

      if (a == sum) {
        return i;
      }
    }

    return x;

  }

}
