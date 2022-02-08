package algorithms.array;

import java.util.*;
import java.util.stream.Collectors;

public class DeleteColumnstoMakeSorted {
    public static void main(String[] args) {
//        String[]strgs = new String[]{"abc","bce","cae"};
        String[]strgs = new String[]{"cbagy","dafhu","ghiji", "abcko"};
        System.out.println(minDeletionSize(strgs));
    }

    public static int minDeletionSize(String[] strgs) {
        int res = 0;
        for (int i = 0; i < strgs[0].length(); ++i)
            for (int j = 0; j < strgs.length - 1; ++j)
                if (strgs[j].charAt(i) > strgs[j + 1].charAt(i)) {
                    res++;
                    break;
                }

        return res;
    }



    static boolean isSorted(String[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].charAt(0) > array[i + 1].charAt(0))
                return false;
        }
        return true;
    }

}
