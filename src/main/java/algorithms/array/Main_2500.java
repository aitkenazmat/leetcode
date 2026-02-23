package algorithms.array;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main_2500 {


  public static void main(String[] args) {
    int[][] grid = new int[][]{ {1,2,3},{4,5,6} };
    deleteGreatestValue(grid);
  }

  public static int deleteGreatestValue(int[][] grid) {
    return deleteGreatestValue(grid, 0);
  }

  public static int deleteGreatestValue(int[][] grid, int sum) {

    if (grid[0].length >0) {
      int[][]newgrid = new int[grid.length][grid[0][0]-1];

      List<Integer> list = new ArrayList<>();
      for (int i = 0; i < grid.length; i++) {
        int[]arr = grid[i];
        Pair gen = gen(arr);
        newgrid[i] = gen.arr;

        list.add(gen.maxInt);
      }
      Optional<Integer> max = list.stream().max(Integer::compareTo);

      sum+=max.get();

      return deleteGreatestValue(newgrid,sum );
    }



    return sum;

  }

  public static Pair  gen(int[]arr) {
    int[]newarr = new int[arr.length-1];

    int maxIndex = 0;
    int maxValue = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > maxValue) {
        maxIndex = i;
        maxValue = arr[i];
      }
    }


    int idx = 0;
    for (int i = 0; i < arr.length; i++) {

      if (i != maxIndex) {
        newarr[idx] = arr[i];
        idx++;
      }
    }

    return new Pair(newarr,maxValue);

  }

  static class Pair {
    int[] arr;
    int maxInt;


    public Pair(){

    }

    public Pair(int[]arr, int maxInt){
      this.arr = arr;
      this.maxInt = maxInt;
    }


  }
}
