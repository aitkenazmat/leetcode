import algorithms.array.DateHelper;

import java.sql.Date;

public class DateHelperTest {

    public static void main(String[] args) {
        test1();
    }

    public static void test1() {

        String date = "23.11.1969 00:05";
        Date date1 = DateHelper.toDate(date);

        System.out.println(date1);
    }
}
