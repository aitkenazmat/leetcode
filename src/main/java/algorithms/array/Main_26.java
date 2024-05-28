package algorithms.array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main_26 {

    public static void main(String[] args) {

//        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        int[] arr = {-3,-1,0,0,0,3,3};
        removeDuplicates(arr);
    }


    public static int removeDuplicates(int[] nums) {

        Set<Integer> set = new TreeSet<>();
        for(int i=0; i < nums.length ; i++) {
            set.add(nums[i]);
        }

        Iterator<Integer> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            nums[i] = iterator.next();
            i++;
        }
        return set.size();

    }
}
