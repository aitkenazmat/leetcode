package algorithms.array;

public class ValidMountainArray {
    public static void main(String[] args) {

//        int[] array = new int[]{1,2,3,4,5,4,3,2,1};
//        int[] array = new int[]{1,3,2};
//        int[] array = new int[]{2,0,2};
        int[] array = new int[]{0,3,2,1};
        System.out.println(validMountainArray(array));
    }

    public static boolean validMountainArray(int[] arr) {

        if (arr.length < 3)
            return false;

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int next = arr[i+1];
            if (current > next ) {
                if (current < 3 )
                    return  false;
                for (int j = current; j < arr.length-1 ; j++) {
                    int currentJ = arr[j];
                    int nextJ = arr[j+1];

                    if (currentJ < nextJ) {
                        return false;
                    }
                }
                break;
            } else if (current == next) {
                return false;
            }
        }
        return  true;
    }
}
