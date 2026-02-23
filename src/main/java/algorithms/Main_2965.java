package algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main_2965 {

    public static void main(String[] args) {
        int[] missingAndRepeatedValues = findMissingAndRepeatedValues(new int[][]{{1,3}, {2,2}});

        System.out.println("");
    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        int repeatedVal = Integer.MIN_VALUE;
        Set<Integer> integerSet = new HashSet<>();
        int totalSum = 0;
        int sum = 1;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int val = grid[i][j];
                totalSum+=sum;
                sum++;
                if (integerSet.contains(val)) {
                    repeatedVal = val;
                } else {
                    integerSet.add(val);
                }
            }
        }

        for (Integer i : integerSet) {
            totalSum-=i;
        }

        return new int[]{repeatedVal, totalSum};

    }
}
