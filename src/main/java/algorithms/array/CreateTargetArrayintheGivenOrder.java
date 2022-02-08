package algorithms.array;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArrayintheGivenOrder {

    public static void main(String[] args) {

        int[]nums = new int[]{0,1,2,3,4};
        int[]index = new int[]{0,1,2,2,1};

        int[] targetArray = createTargetArray(nums, index);


        System.out.println(targetArray);


    }

    public static  int[] createTargetArray(int[] nums, int[] index) {


//        createTargetArray(nums, index, 0);

        return nums;
    }

    public static  int[] createTargetArray(int[] nums, int[] index, int[]arr, int startIndex) {
        for (int i = startIndex; i < index.length; i++) {
            int indexNums = index[i];
            int valNums = i;

            if (indexNums== startIndex) {
                nums[indexNums] = valNums;
            } else {
                for (int j = startIndex; j < nums.length; j++) {
                    nums[j] =  nums[j];
                }
            }


            startIndex++;
            if (startIndex <= index.length) {
                return createTargetArray(nums, index,arr, startIndex);
            }
        }

        return nums;
    }
}
