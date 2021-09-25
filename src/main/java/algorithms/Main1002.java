package algorithms;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Main1002 {
    public static void main(String[] args) {
        //String[]arr = new String[]{"bella","label","roller"};
        String[]arr = new String[]{"azamat"};
        commonChars(arr);
    }

    public static List<String> commonChars(String[] A) {

        List<String> res = new LinkedList<>();
        Map<Character,Integer> map = new HashMap<>();

        for (int i = 0; i < A.length ; i++) {
            String str = A[i];
            Map<Character,Integer> map1 = ggg(str);

            for (Map.Entry entry :  map1.entrySet()) {
                Character key = (Character) entry.getKey();
                Integer val  = (Integer) entry.getValue();
                if (map.get(key)==null) {
                    map.put(key,val);
                } else {
                    Integer val1 = map.get(key);
                    int count = val1 + val;
                    map.put(key,count);
                }
            }
        }


        for (Map.Entry entry  : map.entrySet()) {
            Character key = (Character) entry.getKey();
            Integer val = (Integer) entry.getValue();

            if (val == 3 ) {
                res.add(key.toString());
            } else if (val>4) {
                for (int i = 0; i < val/3 ; i++) {
                    res.add(key.toString());
                }
            }
        }



        return res;
    }


    public static Map<Character,Integer> ggg(String str) {

        Map<Character,Integer> map = new HashMap<>();
        char[]chars = str.toCharArray();
        for (int j = 0; j < chars.length ; j++) {
            if (map.get(chars[j])==null) {
                map.put(chars[j],1);
            } else {
                Integer val = map.get(chars[j]);
                int aa = val+1;
                map.put(chars[j],aa);
            }
        }

        return map;
    }
}
