package algorithms.array;

public class ReplaceElementsWithGreatestElementOnRightSide {

    public static void main(String[] args) {

//        int[]nums = new int[]{17,18,5,4,6,1};
        int[]nums = new int[]{400};
        int[] ints = replaceElements(nums);

        System.out.println(ints);
    }

    public static int[] replaceElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            swap(i, arr);
        }
        arr[arr.length-1] = -1;
        return arr;
    }


    static int[] swap(int i, int[]arr) {
        int maxIndex = i;
        if (i < arr.length - 1) {
             maxIndex = i + 1;
        }

        int max = arr[maxIndex];
        for (int j = i+1; j < arr.length; j++) {
            if (arr[j] > max) {
                max = arr[j];
            }
        }
        arr[i] = max;
        return arr;

    }
}
