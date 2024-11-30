import java.sql.Time;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ConvertingUnixTimeStampToJavaDateTime {

    public static Date convertUnixTimeToDateBeforeJDK8(long seconds){
        Date date = new Date(seconds* 1000L);
        Date date1 = new Date(TimeUnit.MILLISECONDS.convert(seconds, TimeUnit.SECONDS));
        System.out.println(date1);
        return date1;
    }

    public static Date convertUnixTimeToDateTimeInJDK8(long seconds){
        Instant instant = Instant.ofEpochSecond(seconds);
        Date date = Date.from(instant);
        System.out.println(date);

        LocalDateTime date1 = LocalDateTime.ofInstant(instant, ZoneId.of("Australia/Perth"));
        System.out.println(date1);
        return date;
    }

    public static void main(String[] args) {
        long unixTimestamp = 1573768800;
        convertUnixTimeToDateBeforeJDK8(unixTimestamp);
        convertUnixTimeToDateTimeInJDK8(unixTimestamp);
    }
}
