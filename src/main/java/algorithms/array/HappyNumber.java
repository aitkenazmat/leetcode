package algorithms.array;

import java.util.HashMap;
import java.util.Map;

public class HappyNumber {

    public static void main(String[] args) {

//        System.out.println(isHappy(19));
        System.out.println(isHappy(2));
    }

    public static boolean isHappy(int n) {

        Map<Integer,Integer> map = new HashMap<>();
        return isHappy(n,map );
    }

    public static boolean isHappy(int n, Map<Integer,Integer> map) {
        if (map.get(n)==null) {
            map.put(n,n);
        } else {
            return false;
        }
        String s = String.valueOf(n);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            sum+=Math.pow(Double.parseDouble(String.valueOf(s.charAt(i))), 2);
        }
        if (sum!=1) {
            return isHappy(sum,map);
        } else {
            return true;
        }
    }
}
