package app.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;


public class DateTimeUtils {
    public static long convertUTCToLocal(Long utc) {
        Date UTCDate = new Date(utc);
        ZonedDateTime there = ZonedDateTime.ofInstant(UTCDate.toInstant(), ZoneId.of("UTC"));
        LocalDateTime here = there.withZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
        return here.toInstant(ZoneOffset.ofTotalSeconds(0)).toEpochMilli();
    }

    public static Date substractDate(int day) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DAY_OF_MONTH, -day);
        return c.getTime();
    }

    public static String getCurrentDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
