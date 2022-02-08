package algorithms.array;

public class CountGoodTriplets {
    public static void main(String[] args) {
        int[]nums = new int[]{3,0,1,1,9,7,1};
        countGoodTriplets(nums,7,2,3);

    }

    public static int countGoodTriplets(int[] arr, int a, int b, int c) {


        for (int i = 0; i < arr.length ; i+=3) {
            System.out.println(arr[i]);
            System.out.println(arr[i+1]);
            if (i < arr.length - 3)
              System.out.println(arr[i+2]);
        }




        return 0;
    }


    public void fff(int i, int j, int k, int lf) {

    }
}
