package algorithms.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main_925 {
    public static void main(String[] args) {
//        isLongPressedName("alex","aaleex");
        isLongPressedName("saeed","ssaaedd");
    }


    public static boolean isLongPressedName(String name, String typed) {



        int ji= 0;
        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            for (int j = ji; j < typed.length(); j++) {
                if (typed.charAt(j) == c) {
                    for (int k = j; k < typed.length(); k++) {
                        if (typed.charAt(k) != c) {
                            ji = k;
                            break;
                        }
                    }

                    break;

                }
                return false;
            }

        }

        return true;
    }

}
