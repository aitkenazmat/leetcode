package algorithms.matrix;

import java.util.*;

public class TheKWeakestRowsinaMatrix {
    public static void main(String[] args) {

        int[][]mat = new int[][]{ {1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1} };
        kWeakestRows(mat,3);
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        Map<Integer,Integer> integersMap = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    integersMap.put(i,j);
                    break;
                }
            }
        }

//        if (integersMap.size() < mat.length && mat[mat.length-1][mat.length-1] ==1 ) {
//            integersMap.put(mat.length,mat.length);
//        }

        for (Map.Entry<Integer,Integer> entry : integersMap.entrySet()) {
        }




        return null;
    }
 }
