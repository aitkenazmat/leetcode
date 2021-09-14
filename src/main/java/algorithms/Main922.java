package algorithms;

public class Main922 {

    public static void main(String[] args) {

        int[] nums = new int[]{4,2,5,7,13,8};
        int[]response = sortArrayByParityII(nums);

        for (int res: response) {
            System.out.println(res);
        }
    }

    public static int[] sortArrayByParityII(int[] A) {

        int[]evenNums = getEven(A);
        int[]oddNums = getOdd(A);


        int[]response = new int[A.length];


        int index = 0;
        int index2 = 1;

        for (int i = 0; i <  A.length/2; i++) {

            int evenNum = evenNums[i];
            int oddNum = oddNums[i];
            response[index] = evenNum;
            response[index2] = oddNum;
            index+=2;
            index2+=2;

        }

        return response;
    }


    public static  int[] getEven(int[] nums) {
        int size = nums.length/2;

        int[] arr = new int[size];

        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] % 2 == 0 ) {
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;
    }

    public static  int[] getOdd(int[] nums) {
        int size = nums.length/2;

        int[] arr = new int[size];

        int index = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (nums[i] % 2 != 0 ) {
                arr[index] = nums[i];
                index++;
            }
        }
        return arr;
    }

}
