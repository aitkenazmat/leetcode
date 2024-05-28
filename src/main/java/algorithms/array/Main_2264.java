package algorithms.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

public class Main_2264 {

    public static void main(String[] args) {

        System.out.println(largestGoodInteger("1200003456"));
    }

    public static String largestGoodInteger(String num) {

        Integer max = Integer.MIN_VALUE;

        for (int i = 0; i < num.length(); i++) {

            StringJoiner sj = new StringJoiner("");
            for (int j = i; j < i + 3; j++) {
                if (j < num.length()) {
                    sj.add(String.valueOf(num.charAt(j)));
                }
            }
            String str = sj.toString();

            if (str.length() == 3) {
                if (str.charAt(0) == str.charAt(1) && str.charAt(1) == str.charAt(2)) {
                    int i1 = Integer.parseInt(str);
                    if (i1 >max) {
                        max = i1;
                    }
                }
            }
        }

        if (max ==0) {
            return "000";
        }

        return max == Integer.MIN_VALUE ? "" : String.valueOf(max);



//        Map<Character, CustomObject> map = new HashMap<>();
//        for (int i = 0; i < num.length(); i++) {
//            if (map.get(num.charAt(i)) !=null) {
//                CustomObject customObject = map.get(num.charAt(i));
//                customObject.getIndex().add(i);
//                int currentCount = customObject.getCount();
//                customObject.setCount(++currentCount);
//
//                map.put(num.charAt(i), customObject);
//            } else {
//                CustomObject customObject = new CustomObject();
//                customObject.getIndex().add(i);
//                customObject.setCount(1);
//                map.put(num.charAt(i), customObject);
//            }
//        }
//
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < num.length(); i++) {
//            Character c = num.charAt(i);
//
//            CustomObject customObject = map.get(c);
//
//            List<Integer> index = customObject.getIndex();
//            if (index.size() >= 3) {
//
//                int count = 0;
//                for (int j = 0; j < index.size(); j++) {
//                    if (j < index.size()-1) {
//                        if (index.get(j+ 1) - index.get(j) ==1) {
//                            count++;
//                        }
//                    }
//
//                }
//
//                if (count >= 2) {
//
//                    if ( Integer.parseInt(String.valueOf(num.charAt(i))) > max) {
//                        max = Integer.parseInt(String.valueOf(num.charAt(i)));
//                    }
//
//                }
//            }
//
//        }
//
//        if (max != Integer.MIN_VALUE) {
//            char b = (char) max;
//
//            StringJoiner sj = new StringJoiner("");
//            sj.add(String.valueOf(b));
//            sj.add(String.valueOf(b));
//            sj.add(String.valueOf(b));
//            return sj.toString();
//        }
//
//        return "";
    }

    static class CustomObject {
        private List<Integer> index = new ArrayList<>();
        private int count;

        public List<Integer> getIndex() {
            return index;
        }

        public void setIndex(List<Integer> index) {
            this.index = index;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }
    }
}
