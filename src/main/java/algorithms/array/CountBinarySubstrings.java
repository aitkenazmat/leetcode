package algorithms.array;

import java.util.List;

public class CountBinarySubstrings {

    public static void main(String[] args) {
        System.out.println(countBinarySubstrings("00110011"));
        System.out.println(countBinarySubstrings("10101"));
        System.out.println(countBinarySubstrings("00110"));
//        countBinarySubstrings("1234");
    }


    public static int countBinarySubstrings(String s) {
        int res = 0;
        for (int i = s.length(); i > 0; i--) {
            for (int j = 0; j < i; j++) {
                String substring = s.substring(j, i);
                if (test1(substring)) {
                    res++;
                    break;
                }
            }
        }

        int res2 = res;
        if (s.length() % 2 == 0) {
            res2 = res2 - 1;
        }

        return s.charAt(0) == '1' ? res : res2  ;
    }

    public static boolean test1(String s) {
        if (s.length() > 1) {
            int countZero= 0;
            int countOne = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == '0') {
                    countZero++;
                }
                if (s.charAt(i) == '1') {
                    countOne++;
                }
            }

            if (countOne == countZero) {
                return true;
            } else if (countOne == 0 && countZero != 0) {
                return true;
            } else if (countZero == 0 && countOne != 0) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }

//    public static boolean test2(String s) {
//        if (s.length() > 1) {
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) != '0') {
//                    return false;
//                }
//            }
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    public static boolean test3(String s) {
//        if (s.length() > 1) {
//            for (int i = 0; i < s.length(); i++) {
//                if (s.charAt(i) != '1') {
//                    return false;
//                }
//            }
//            return true;
//        } else  {
//            return false;
//        }
//    }

}
