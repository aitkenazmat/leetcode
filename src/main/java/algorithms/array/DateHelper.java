package algorithms.array;

import org.apache.commons.lang3.StringUtils;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;

public class DateHelper {
    public static XMLGregorianCalendar utilDateToXMLGregorianCalendar(java.util.Date dt) {
        if(dt != null) {
            GregorianCalendar gc = new GregorianCalendar();
            gc.setTime(dt);

            try {
                return DatatypeFactory.newInstance()
                        .newXMLGregorianCalendar(gc);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    private final static DateFormat df1 = new SimpleDateFormat("dd.MM.yyyy HH:mm");
    public static Date toDate(String date) {
        if (StringUtils.isNotBlank(date)) {
            try {
                return Date.valueOf(date);
            } catch (IllegalArgumentException e) {
                try {
                    return utilDateToSqlDate(df1.parse(date));
                } catch (ParseException ex) {
                }
            }
        }
        return null;
    }

    public static Date utilDateToSqlDate(java.util.Date utilDate) {
        return new Date(utilDate.getTime());
    }

    public static Date toDate(XMLGregorianCalendar calendar) {
        if (calendar == null) {
            return null;
        }
        long time = calendar.toGregorianCalendar().getTime().getTime();
        return new Date(time);
    }

    public static Timestamp toTimestamp(XMLGregorianCalendar calendar) {
        if (calendar == null) {
            return null;
        }
        return new Timestamp(calendar.toGregorianCalendar().getTimeInMillis());
    }
}
