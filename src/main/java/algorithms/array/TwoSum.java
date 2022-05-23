package algorithms.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoSum {

    public static void main(String[] args) {
        int[] nums  = new int[]{2,7,4,1,8,1};
//        int[] nums  = new int[]{1,2,1};
        System.out.println(lastStoneWeight(nums));
    }

    public static int[] twoSum(int[] nums, int target) {

        int[] arr = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i!=j) {
                    if (nums[i] + nums[j] == target) {
                        arr[0] = i;
                        arr[1] = j;
                    }
                }
            }
        }

        return arr;
    }

    public static boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i+=2) {
            if (nums[i] != nums[i+1]) {
                return false;
            }
        }
        return true;
    }


    public static int maxArea(int[] height) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < height.length; i++) {
            int f  = height[i];
            for (int j = 0; j < height.length; j++) {
                if (i != j) {
                    int s = height[j];
                    int m = Math.min(f, s);
                    int n = j - i;
                    list.add( m * n);
                }

            }
        }
        return Collections.max(list);
    }

    private static int getFirstMaxIndex(int[] height) {
        int max = 0;
        for (int i = 1; i < height.length; i++) {
            if (height[i] > height[max]) {
                max = i;
            }
        }

        return max;
    }

    private static int getSecondMaxIndex(int[] height, int maxFirstIndex) {
        int max = height.length-1;
        for (int i = height.length-1; i > 0 ; i--) {
            if (height[i] > height[max] && height[i] < height[maxFirstIndex]) {
                max = i;
            }
        }

        return max;
    }


    public static int lastStoneWeight(int[] stones) {
        List<Integer> stoneList = getList(stones);
        rec(stoneList, stones);
        return !stoneList.isEmpty() ? stoneList.get(0) : 0;
    }

    private static List<Integer> rec(List<Integer> stoneList, int s[] ) {
        if (stoneList.size() > 1 ) {
            int yIndex = getY(stoneList);
            int xIndex = getX(stoneList, yIndex);


            int xValue  = stoneList.get(xIndex);
            int yValue = stoneList.get(yIndex);

            if (stoneList.get(xIndex).equals(stoneList.get(yIndex)) ) {
                stoneList.remove(xIndex);
                stoneList.remove(yIndex);
            } else {
                stoneList.set(yIndex, stoneList.get(yIndex) - stoneList.get(xIndex));
                stoneList.remove(xIndex);
            }

            rec(stoneList, s);
        }
        return stoneList;
    }

    private static List<Integer> getList(int[] stones) {
        List<Integer> list = new ArrayList<>(stones.length);
        for (int i = 0; i < stones.length; i++) {
            list.add(stones[i]);
        }
        return list;
    }

    private static int getX(List<Integer> stones, int yIndex) {
        int max = getDefine(yIndex, stones);
        for (int i = 0; i < stones.size(); i++) {
            if ( i != yIndex && stones.get(i) > stones.get(max)) {
                max = i;
            }
        }
        return max;
    }

    static int getDefine(int index, List<Integer> integers) {

        int nextMaxIndex = 0;
        for (int i = 0; i < integers.size(); i++) {
            if (i != index) {
                nextMaxIndex = i;
                break;
            }
        }

        return nextMaxIndex;
    }

    private static int getY(List<Integer> stones) {
        int max = 0;
        for (int i = 1; i < stones.size(); i++) {
            if (stones.get(i) > stones.get(max)) {
                max = i;
            }
        }
        return max;
    }
}
