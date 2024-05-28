package algorithms.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class Main_2965 {

    public static void main(String[] args) {

        int[][] matrix = new int[][] { {1,3} , {2,2} };

        findMissingAndRepeatedValues(matrix);

    }

    public static int[] findMissingAndRepeatedValues(int[][] grid) {

        Map<Integer,Integer> map = new TreeMap<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                Integer val = map.get(grid[i][j]);
                if (val == null) {
                    map.put(grid[i][j], 1);
                } else {
                    map.put(grid[i][j], ++val);
                }
            }
        }

        int[]arr = new int[2];

        int k = 1;

        boolean find0 = false;
        boolean find1 = false;

        for ( Map.Entry<Integer,Integer> entry :  map.entrySet()) {
            if (!find0 && entry.getValue()>1) {
                arr[0] = entry.getKey();
                find0 = true;
                //break;
            }

            if (!find1 && map.get(k) == null) {
                arr[1] = k;
                find1 = true;
            }

            if (find1 && find0) {
                break;
            }

            k++;
        }




        return arr;

    }
}
