package algorithms.array;

public class MajorityElement {
    public static void main(String[] args) {


        System.out.println(majorityElement(new int[]{2,2,1,1,1,2,2}));
    }

    public static int majorityElement(int[] nums) {

        int m = nums.length / 2;


        for (int i = 0; i < nums.length ; i++) {
            int summ = getSumm(nums, i);
            if (summ>=m) {
                return nums[i];
            }
        }
        return 0;
    }

    public static int getSumm(int[] nums, int index) {

        int summ = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i != index) {
                if (nums[i] == nums[index]) {
                    summ++;
                }
            }
        }

        return summ;
    }
}
