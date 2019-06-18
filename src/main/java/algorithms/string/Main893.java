package algorithms.string;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * 893. Groups of Special-Equivalent Strings
 *
 * */
public class Main893 {

    public static void main(String[] args) {
        String[] A = new String[]{"abcd","cdab","adcb","cbad"};
        numSpecialEquivGroups(A);
    }


    public static int numSpecialEquivGroups(String[] A) {

        List<String> linkList = new LinkedList<String>(Arrays.asList(A));

        int count = 0;
        for (int i = 0; i < linkList.size() ; i++) {
            System.out.println(A[i]);
            char[] chars = A[i].toCharArray();
            String ss = "";
            for (int j = A[i].length()-1; j >=0  ; j--) {
                ss+= chars[j];
            }
            System.out.print(ss);
            System.out.println("---------------------");
            if (isExist(A,ss)) {
                ((LinkedList<String>) linkList).remove(i);
                count++;
            }
        }

        System.out.println("count = " + count);
        return 0;
    }

    public static boolean isExist(String[]strings,String str) {

        boolean isExist = false;
        for (String s : strings) {
            if (s.equals(str)) {
                isExist = true;
                break;
            }

        }
        return isExist;
    }
}
