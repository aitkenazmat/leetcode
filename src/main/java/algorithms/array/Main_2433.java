package algorithms.array;

public class Main_2433 {

    public static void main(String[] args) {

        int[]arr = new int[]{5,2,0,3,1};
        findArray(arr);
    }



    public static int[] findArray(int[] pref) {

        int[] result = new int[pref.length];

        result[0] = pref[0];
        for (int i = 1; i < pref.length; i++) {

            int r = 0;
            for (int j = i; j <= i; j++) {
                r^= pref[j];
            }
            result[i] = r;
        }

        return result;
    }
}
