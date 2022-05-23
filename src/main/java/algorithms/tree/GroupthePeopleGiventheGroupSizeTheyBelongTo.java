package algorithms.tree;

import java.util.ArrayList;
import java.util.List;

public class GroupthePeopleGiventheGroupSizeTheyBelongTo {

  public static void main(String[] args) {
//    int[]groupSizes = new int[]{3,3,3,3,3,1,3};
    int[]groupSizes = new int[]{2,1,3,3,3,2};
//    int[]groupSizes = new int[]{2,2,1,1,1,1,1,1};
    List<List<Integer>> lists = groupThePeople(groupSizes);

    lists.size();
  }

  public static List<List<Integer>> groupThePeople(int[] groupSizes) {
    List<Integer> blackList = new ArrayList<>();
    List<List<Integer>> response = new ArrayList<>();
    int counterResponse = 0;
    for (int i = 0; i < groupSizes.length; i++) {
      if (!isExistBlackList(blackList, i)) {
        int groupSize = groupSizes[i];
        List<Integer> group = new ArrayList<>();
        group.add(i);
        blackList.add(i);
        counterResponse++;

        if (groupSize == 1) {
          response.add(group);
        } else {
          for (int j = i + 1; j < groupSizes.length; j++) {
            if (groupSizes[j] == groupSize) {
              group.add(j);
              blackList.add(j);
              if (group.size() == groupSize) {
                response.add(group);
                break;
              }
            }
          }
          if (counterResponse > response.size()) {
            response.add(group);
          }
        }
      }
    }

    return response;
  }

  private static boolean isExistBlackList(List<Integer> blackList, Integer integer) {

    for (int i = 0; i < blackList.size(); i++) {
      if (blackList.get(i).equals(integer) ) {
        return true;
      }
    }

    return false;
  }


}
