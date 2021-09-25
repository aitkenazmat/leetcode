package algorithms.array;

import java.util.HashMap;
import java.util.Map;

public class ShuffleString {
    public static void main(String[] args) {

        int[] indexces = new int[]{4,5,6,7,0,2,1,3};
        String codeleet = restoreString("codeleet", indexces);
        System.out.println(codeleet);
    }

    public static String restoreString(String s, int[] indices) {
        char[] chars = new char[s.length()];
        for (int i = 0; i < indices.length ; i++) {
            chars[indices[i]] = s.charAt(i);

        }
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb2.append(chars[i]);
        }

        return sb2.toString();


    }
}
