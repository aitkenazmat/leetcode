package algorithms.hashmap;

import javax.management.StringValueExp;
import java.util.*;

public class CheckifEveryRowandColumnContainsAllNumbers {

    public static void main(String[] args) {
//        int[][] matrix = new int[][]{ {1,2,3}, {3,1,2},{2,3,1}};
//        System.out.println(checkValid(matrix));

        cellsInRange("A2:C4");
    }

    public static List<String> cellsInRange(String s) {
        char s0 = s.charAt(0);
        char s3 = s.charAt(3);

        int s1 = Character.getNumericValue(s.charAt(1));
        int s4 = Character.getNumericValue(s.charAt(4));

        Map<Character, Character> mapX = new HashMap<>();
        mapX.put('A','A');
        mapX.put('B','B');
        mapX.put('C','C');
        mapX.put('D','D');
        mapX.put('E','E');
        mapX.put('F','F');
        mapX.put('G','G');
        mapX.put('H','H');
        mapX.put('I','I');
        mapX.put('J','J');
        mapX.put('K','K');
        mapX.put('L','L');
        mapX.put('M','M');
        mapX.put('N','N');
        mapX.put('O','O');
        mapX.put('P','P');
        mapX.put('Q','Q');
        mapX.put('R','R');
        mapX.put('S','S');
        mapX.put('T','T');
        mapX.put('U','U');
        mapX.put('V','V');
        mapX.put('W','W');
        mapX.put('X','X');
        mapX.put('Y','Y');
        mapX.put('Z','Z');

        List<String> response = new LinkedList<>();
        for (Map.Entry<Character,Character> entry :  mapX.entrySet()) {
            if (s0 <= entry.getKey()  && s3>=entry.getKey() ) {
                if (s1 == s4) {
                    response.add(entry.getValue() + String.valueOf(s1));
                } else {
                    for (int i = s1; i <= s4; i++) {
                        response.add(entry.getValue() + String.valueOf(i));
                    }
                }
            }
        }

        return response;
    }

    public static boolean checkValid(int[][] matrix) {
        if (checkValidRow(matrix)) {
            return checkValidColumn(matrix);
        } else {
            return false;
        }
    }

    public static boolean checkValidRow(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            Map<Integer, Integer> integerIntegerMap = genInts(n);
            for (int j = 0; j < matrix[i].length; j++) {
                int val  = matrix[i][j];
                if (integerIntegerMap.get(val) !=null) {
                    integerIntegerMap.remove(val);
                } else {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean checkValidColumn(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(matrix[i][j]);
            }
            System.out.println("----");
        }

        return true;
    }

    public static Map<Integer,Integer> genInts(int n){
        Map<Integer,Integer> list = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            list.put(i,i);
        }
        return list;
    }
}
