import java.time.*;
import java.util.Date;


class DateConverters{

    private static final ZoneId zoneId = ZoneId.systemDefault();
    public static Instant dateToInstant(Date date){
        return date.toInstant();
    }

    public static Date instantToDate(Instant instant){
        return Date.from(instant);
    }

    public static LocalDate dateToLocalDate(Date date){
        return dateToInstant(date).atZone(zoneId).toLocalDate();
    }

    public static Date localDateToDate(LocalDate localDate){
        return Date.from(localDate.atStartOfDay(zoneId).toInstant());
    }

    public static LocalDateTime dateToLocalDateTime(Date date){
        return date.toInstant().atZone(zoneId).toLocalDateTime();
    }

    public static Date localDateTimeToDate(LocalDateTime localDateTime){
        return Date.from(localDateTime.atZone(zoneId).toInstant());
    }

    public static OffsetDateTime dateToOffsetDateTime(Date date){
        return date.toInstant().atZone(zoneId).toOffsetDateTime();
    }

    public static Date offsetDateTimeToDate(OffsetDateTime offsetDateTime){
        return Date.from(offsetDateTime.toInstant());
    }

    public static LocalTime dateToLocalTIme(Date date){
        return LocalTime.ofInstant(date.toInstant(), zoneId);
    }

    public static Date dateFromLocalTime(LocalTime localTime){
        return Date.from(localTime.atDate(LocalDate.EPOCH).toInstant(zoneId.getRules().getOffset(Instant.now())));
    }

    public static OffsetTime offsetTimeFromDate(Date date){
        return OffsetTime.ofInstant(date.toInstant(), zoneId);
    }

    public static Date dateFromOffsetTime(OffsetTime offsetTime){
        return Date.from(offsetTime.atDate(LocalDate.EPOCH).toInstant());
    }
}

public class ConvertingBetweenDateAndTemporal {
    public static void main(String[] args) {
        // Converting from Date to instant method

        Date date = new Date();
        System.out.println(date);

        Instant instantFromDate = date.toInstant();
        System.out.println(instantFromDate);

        //converting instant to date
        Date dateFromInstant = Date.from(instantFromDate);
        System.out.println(dateFromInstant);

        System.out.println(ZoneId.systemDefault());
        System.out.println(ZoneOffset.systemDefault());
    }
}
