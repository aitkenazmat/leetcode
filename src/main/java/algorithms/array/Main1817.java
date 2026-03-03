package algorithms.array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main1817 {

  public static void main(String[] args) {
    int[] res = findingUsersActiveMinutes(new int[][]{{0, 5}, {1, 2}, {0, 2}, {0, 5}, {1, 3}}, 5);
    System.out.println("");
  }

  public static int[] findingUsersActiveMinutes(int[][] logs, int k) {
    int[] response = new int[k];

    Map<Integer, Set<Integer>> map = new HashMap<>();

    for (int[] log : logs) {
      int userId = log[0];
      int activeMinutes = log[1];

      Set<Integer> activates = map.get(userId);
      if (activates != null) {
        activates.add(activeMinutes);
        map.put(userId, activates);
      } else {
        Set<Integer> set = new HashSet<>();
        set.add(activeMinutes);
        map.put(userId, set);
      }
    }

    for (Set<Integer> set :  map.values()) {
      int min = set.size();
      if (min <= k) {
        response[min-1]+=1;
      }
    }

    return response;
  }
}
