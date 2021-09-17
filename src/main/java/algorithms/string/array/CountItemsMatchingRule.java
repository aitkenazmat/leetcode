package algorithms.string.array;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class CountItemsMatchingRule {
    public static void main(String[] args) {

        List<String> str1 = new LinkedList<>();
        str1.add("phone");
        str1.add("blue");
        str1.add("pixel");

        List<String> str2 = new LinkedList<>();
        str2.add("computer");
        str2.add("silver");
        str2.add("lenovo");

        List<String> str3 = new LinkedList<>();
        str3.add("phone");
        str3.add("gold");
        str3.add("iphone");

        List<String> str4 = new LinkedList<>();
        str4.add("phone");
        str4.add("silver");
        str4.add("iphone");


        List<List<String>> arr=  new LinkedList<>();
        arr.add(str1);
        arr.add(str2);
        arr.add(str3);
        arr.add(str4);


        System.out.println(countMatches(arr, "color", "silver"));

    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int keyRule = 0;
        if (ruleKey.equals("color")) {
            keyRule = 1;
        } else if (ruleKey.equals("name")) {
            keyRule = 2;
        }

        int count  = 0;
        for (int i = 0 ;i < items.size(); i++) {
            List<String> strings = items.get(i);
            String kr = strings.get(keyRule);
            if (kr.equals(ruleValue)) {
                count++;
            }
        }


        return count;
    }

//    public static int getCount(List<String> items, String ruleKey,String ruleValue) {
//        for ( String item :  items) {
//            item.
//        }
//
//        return 1;
//    }
}
