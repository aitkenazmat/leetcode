package algorithms.string;


/**
 *
 * 944. Delete Columns to Make Sorted
 *
 * */


public class Main944 {

    public static void main(String[] args) {

        String[] strings = new String[]{"cba","daf","ghi"};
        System.out.println(minDeletionSize(strings));

    }

    public static int minDeletionSize(String[] A) {
        int minDeletionSize = 0;
        for (int i =0;i < A.length; i++) {
            if (isSortedAsc(A[i]) || isSortedDesc(A[i]))
                minDeletionSize++;
        }
        return minDeletionSize;
    }


    public static boolean isSortedAsc(String str) {

        boolean isSorted = false;

        int countAsc = 1;
        char firstChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (firstChar<=str.charAt(i)) {
                firstChar = str.charAt(i);
                countAsc++;
            }
        }

        if (str.length()!=1) {
            if (str.length() == countAsc)
                isSorted = true;
        }


        return isSorted;
    }


    public static boolean isSortedDesc(String str) {

        boolean isSorted = false;

        int countDesc = 1;
        char firstChar = str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            if (firstChar>=str.charAt(i)) {
                firstChar = str.charAt(i);
                countDesc++;
            }
        }

        if (str.length()!=1) {
            if (str.length() == countDesc)
                isSorted = true;
        }


        return isSorted;
    }
}
