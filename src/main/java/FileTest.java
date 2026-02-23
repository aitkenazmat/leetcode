import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class FileTest {

    public static void main(String[] args) throws ParseException, DatatypeConfigurationException {
        OffsetDateTime now1 = OffsetDateTime.now().minusDays(1).minusMinutes(1);

        OffsetDateTime now = OffsetDateTime.now();



        long between = ChronoUnit.DAYS.between(now1, now );

        System.out.println(between);


    }

}


