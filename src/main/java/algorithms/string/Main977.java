package algorithms.string;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Main977 {
    public static void main(String[] args) {

        int[] arr = new int[]{-4,-1,0,3,10};
        int[]res  = sortedSquares(arr);


        for (int i = 0; i <res.length ; i++) {
            System.out.println(res[i]);
        }
    }


    public static int[] sortedSquares(int[] A) {


        List<Integer> sortedIntegers = new LinkedList<Integer>();

        int[] res = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int dd = (int) Math.pow(A[i],2);
            sortedIntegers.add(dd);
        }

        Collections.sort(sortedIntegers);



        int i =0;
        for (Integer integer : sortedIntegers) {
            res[i] = integer;
            i++;
        }

        return res;
    }
}
