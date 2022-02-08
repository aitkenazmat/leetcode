package algorithms.array;

import java.util.HashSet;
import java.util.Set;

public class DistributeCandies {
    public static void main(String[] args) {

        int[]candyType = new int[]{1,1,2,3};

        System.out.println(distributeCandies(candyType));
    }

    public static int distributeCandies(int[] candyType) {
        int can = candyType.length /2;
        Set<Integer> uniqueCandy = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            uniqueCandy.add(candyType[i]);
        }

        if (can > uniqueCandy.size()) {
            return uniqueCandy.size();
        } else if (can < uniqueCandy.size()) {
            return can;
        }

        if (can == uniqueCandy.size()) {
            return can;
        } else {
            return 1;
        }
    }
}
