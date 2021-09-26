package algorithms.array;

public class CheckIfNandItsDoubleExist {

    public static void main(String[] args) {

        int[]arr = new int[]{3,1,7,11};

        System.out.println(checkIfExist(arr));
    }

    public static boolean checkIfExist(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            if (checkIfExist(arr, i)) {
                return true;
            }
        }

        return false;

    }

    public static boolean checkIfExist(int[] arr, int index) {

        int m = arr[index];
        for (int i = 0; i < arr.length ; i++) {
            if (i!=index) {
                if (arr[i] == 2 * m) {
                    return true;
                }
            }
        }

        return false;
    }
}
