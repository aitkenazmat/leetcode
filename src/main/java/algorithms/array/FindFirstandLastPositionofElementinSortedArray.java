package algorithms.array;



public class FindFirstandLastPositionofElementinSortedArray {
    public static void main(String[] args) {
//        int[]nums = new int[]{1};
//        int[]nums = new int[]{2,2};
        int[]nums = new int[]{1,1,1};

        searchRange(nums, 2);
    }

    public static int[] searchRange(int[] nums, int target) {
        int index = -1;
        int low = 0;
        int high = nums.length-1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (nums[mid] < target) {
                low = mid + 1;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else if (nums[mid] == target) {
                index = mid;
                break;
            }
        }

        if (index!=-1) {
            int[]res = new int[2];
            int begin = index;
            while (begin!= 0 && nums[begin-1] == target) {
                begin--;
            }

            int finish = index;
            while (finish!= nums.length -1 && nums[finish+1] == target) {
                finish++;
            }

            res[0] = begin;
            res[1] = finish;
            return res ;

        } else {
            return new int[]{-1,-1};
        }
    }
}
