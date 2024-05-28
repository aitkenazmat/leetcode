package algorithms.hashmap;

import java.util.*;

public class FindTheDuplicateNumber {
    public static void main(String[] args) {



//        int[]nums = new int[]{1,1,2};
        int[]nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int findDuplicate(int[] nums) {

        Integer response = -1;
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) !=null) {
                response =  nums[i];
                break;
            } else {
                map.put(nums[i],nums[i]);
            }
        }
        return response;
    }


    public static int missingNumber(int[] nums) {
        Integer response = -1;
        Map<Integer, Integer> map = getMap(nums);
        int to = map.size();
        for (int i = 0; i <= to; i++) {
            if (map.get(i) == null) {
                response = i;
                break;
            }
        }

        return response;
    }

    static Map<Integer,Integer> getMap(int[] nums) {
        Map<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],nums[i]);
        }
        return map;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] <= target) {
                    if (matrix[i][j]==target) {
                        return true;
                    }
                } else {
                    break;
                }
            }
        }
        return false;
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
       List<Pair> list = new LinkedList<>();
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            int value = i;
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j]==1) {
                    count++;
                } else {
                    break;
                }
            }

            list.add(new Pair(count, value));

        }

        Collections.sort(list);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i).getVal();
        }

        return res;
    }

    public static void reverseString(char[] s) {

        int i = 0;
        int j = s.length - 1;

        while(i <= j){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static int removeDuplicates(int[] nums) {

        Set<Integer> set = new HashSet();
        for(int i=0; i < nums.length ; i++) {
            set.add(nums[i]);
        }

        return set.size();

    }

    static class Pair implements Comparable<Pair>{
        private Integer key;
        private Integer val;

        public Pair(Integer key, Integer val) {
            this.key = key;
            this.val = val;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }


        @Override
        public int compareTo(Pair o) {
            return this.key.compareTo(o.getKey());
        }
    }
}
