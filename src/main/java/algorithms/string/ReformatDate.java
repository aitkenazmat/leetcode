package algorithms.string;

import java.util.HashMap;
import java.util.Map;
import java.util.StringJoiner;

public class ReformatDate {
    public static void main(String[] args) {
        System.out.println(reformatDate("20th Oct 2052"));
        System.out.println(reformatDate("6th Jun 1933"));
    }

    public static String reformatDate(String date) {
        Map<String, String> monthMap = new HashMap<>();
        monthMap.put("Jan","01");
        monthMap.put("Feb","02");
        monthMap.put("Mar","03");
        monthMap.put("Apr","04");
        monthMap.put("May","05");
        monthMap.put("Jun","06");
        monthMap.put("Jul","07");
        monthMap.put("Aug","08");
        monthMap.put("Sep","09");
        monthMap.put("Oct","10");
        monthMap.put("Nov","11");
        monthMap.put("Dec","12");
        String[] split = date.split(" ");

        String day = split[0];
        String month = split[1];
        String year = split[2];

        StringJoiner sj = new StringJoiner("-");
        sj.add(year);
        sj.add(monthMap.get(month));
        if (day.charAt(1) <=57) {
            sj.add(day.charAt(0) + String.valueOf(day.charAt(1)));
        } else {
            sj.add(String.valueOf("0"+day.charAt(0)));
        }



        return sj.toString();
    }

}
