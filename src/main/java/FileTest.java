import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.GregorianCalendar;
import java.util.Locale;

public class FileTest {

    public static void main(String[] args) throws ParseException, DatatypeConfigurationException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ssXXX");
        LocalDateTime dateTime = LocalDateTime.parse("2021-12-06T00:00:00+06:00", formatter);

        LocalDateTime localDateTime = dateTime.minusMinutes(10);


        ZonedDateTime zoneDateTime = ZonedDateTime.of(localDateTime, ZoneId.systemDefault());
        GregorianCalendar gregorianCalendar = GregorianCalendar.from(zoneDateTime);

        XMLGregorianCalendar xmlGregorianCalendar =
                DatatypeFactory.newInstance()
                        .newXMLGregorianCalendar(gregorianCalendar);

        System.out.println("XMLGregorianCalendar format : "
                + xmlGregorianCalendar);


    }

}


