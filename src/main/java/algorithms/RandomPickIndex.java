package algorithms;

import java.util.*;
import java.util.List;

public class RandomPickIndex {

  public Map<Integer, List<Integer> > map  = new HashMap<>();

  public RandomPickIndex(int[] nums) {

    for (int i = 0; i < nums.length; i++) {
      int val = nums[i];
      List<Integer> values = map.get(val);
      if (values==null) {
        List<Integer> v = new ArrayList<>();
        v.add(i);
        map.put(val, v);
      } else {
        values.add(i);
        map.put(val, values);
      }
    }
  }

  public int pick(int target) {

    List<Integer> resultIndex =  map.get(target);

    int rnd = new Random().nextInt(resultIndex.size());
    return resultIndex.get(rnd);
  }



}
