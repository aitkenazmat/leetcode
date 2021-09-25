package algorithms.array;

import java.util.LinkedList;
import java.util.List;

public class KidsWithTheGreatestNumberOfCandies {
    public static void main(String[] args) {

        int[] nums = new int[]{12,12};
        kidsWithCandies(nums,10);

    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = getMax(candies);
        List<Boolean> booleans = new LinkedList<>();
        kidsWithCandies(candies, extraCandies,0, max,booleans);
        return booleans;
    }

    public static int getMax(int[] candies) {
        int max = candies[0];
        for (int i = 1; i < candies.length ; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }
        return max;
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies, int index, int max, List<Boolean> booleans){

        if (index >= candies.length) {
            return booleans;
        }

        if (candies[index]+extraCandies >= max) {
            booleans.add(true);
        } else {
            booleans.add(false);
        }
        index++;

        return kidsWithCandies(candies, extraCandies, index, max, booleans);
    }
}
