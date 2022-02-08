package algorithms.array;

import java.util.LinkedList;
import java.util.List;

public class DecodeXORedArray {
    public static void main(String[] args) {

        int[]arr = new int[]{1,2,3};
        decode(arr, 1);
    }

    public static int[] decode(int[] encoded, int first) {
        int response[] = new int[encoded.length+1];
        response[0] = first;
        int preview = first;
        for(int i=0; i< encoded.length; i++){
            response[i+1] = preview ^ encoded[i];
            preview = preview ^ encoded[i];
        }
        return response;
    }
}
