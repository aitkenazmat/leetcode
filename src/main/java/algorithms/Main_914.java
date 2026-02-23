package algorithms;

import java.util.*;
import java.util.List;

public class Main_914 {

  public static void main(String[] args) {

//    int[]deck = new int[]{1,2};
    int[]deck = new int[]{1,2,3,4,4,3,2,1};
    System.out.println(hasGroupsSizeX(deck));
  }

  public static boolean hasGroupsSizeX(int[] deck) {



    return true;

  }

  static int findMaxGroupSize(int deckSize) {
    for (int i = deckSize-1; i >=1 ; i--) {
      if (deckSize / i == 0) {
        return i;
      }
    }
    return -1;
  }


  static int getCountGroup(int[] deck, Set<Integer> set) {

    Map<Integer,Integer> map = new HashMap<>();

    for (int i = 0; i < deck.length; i++) {
      set.add(deck[i]);
      Integer count = map.get(deck[i]);
      if (count==null) {
        map.put(deck[i],1);
      } else {
        Integer ncount = count+1;
        map.put(deck[i],ncount);
      }
    }

    Integer max = Integer.MIN_VALUE;
    for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
      if (entry.getValue() > max) {
        max = entry.getValue();
      }
    }
    return max==1 ? 2 : max;
  }
}
