package algorithms.array;

public class RemoveOneElementtoMaketheArrayStrictlyIncreasing {

    public static void main(String[] args) {

        int[] nums = new int[]{10,1,2,3,4,5,6};
//        int[] nums = new int[]{1,1,1};
        System.out.println(canBeIncreasing(nums));
    }

    public static boolean canBeIncreasing(int[] nums) {
       if (isSortedAndHasNotUniqueElement(nums)) {
           return  true;
       }  else {
           for (int i = 0; i < nums.length ; i++) {
               int[] ans = remove(nums, i);
               if (isSortedAndHasNotUniqueElement(ans)) {
                   return true;
               }
           }
       }
        return false;
    }


    public static int[] remove(int[] nums, int indexForRemove){
        int[] ans = new int[nums.length-1];
        boolean f = false;
        for (int i = 0; i < nums.length-1 ; i++) {

            if (i == indexForRemove) {
                f = true;
                ans[indexForRemove] = nums[indexForRemove+1];
            } else{
                if (f) {
                    ans[i] = nums[i+1];
                } else{
                    ans[i] = nums[i];
                }

            }
        }

        return ans;

    }

    public static boolean isSortedAndHasNotUniqueElement(int[] nums) {
        int firstElement  = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (firstElement > nums[i]) {
                return false;
            }

            if (firstElement == nums[i]) {
                return false;
            }

            firstElement = nums[i];
        }
        return true;
    }
}
