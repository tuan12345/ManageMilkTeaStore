package app.util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Date;

public class DateTimeUtils {
    public static long convertUTCToLocal(Long utc) {
        Date UTCDate = new Date(utc);
        ZonedDateTime there = ZonedDateTime.ofInstant(UTCDate.toInstant(), ZoneId.of("UTC"));
        LocalDateTime here = there.withZoneSameInstant(ZoneId.systemDefault()).toLocalDateTime();
        return here.toInstant(ZoneOffset.ofTotalSeconds(0)).toEpochMilli();
    }
}
