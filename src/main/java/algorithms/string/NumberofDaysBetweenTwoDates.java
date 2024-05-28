package algorithms.string;

import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumberofDaysBetweenTwoDates {
    public static void main(String[] args) {
        System.out.println(daysBetweenDates("2019-06-29", "2019-06-30"));
    }

    public static int daysBetweenDates(String date1, String date2) {
        long daysBetween = ChronoUnit.DAYS.between(LocalDate.parse(date1), LocalDate.parse(date2));
            return Math.abs((int )daysBetween);
    }
}