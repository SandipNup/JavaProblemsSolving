import java.time.*;
import java.time.format.DateTimeFormatter;

public class JDK8DateTimeExamples {
    public static void main(String[] args) {
        // converting string iso date format 2022-03-10 to LocalData objct  DateTimeFormatter.ISO_DATE


        LocalDate parsedDate = LocalDate.parse("2022-03-10");
        System.out.println(parsedDate);

        // converting local time format to LocalTime object ISO format 10:30:50 DateTimeFormatter.ISO_TIME
        LocalTime localTime = LocalTime.parse("10:30:50");
        System.out.println(localTime);

        // 2020-06-01T11:20:15 ISO format DateTimeFormatter.ISO_LOCAL_DATE_TIME
        LocalDateTime localDateTime = LocalDateTime.parse("2020-06-01T11:20:15");
        System.out.println(localDateTime);

        // To parse zoned date time using default formatter it must respect the DateTimeFormatter.ISO_ZONED_DATE_TIME
        //   2020-06-01T10:15:30+09:00[Asia/Tokyo]
        ZonedDateTime zonedDateTime = ZonedDateTime.parse("2020-06-01T10:15:30+09:00[Asia/Tokyo]");
        System.out.println(zonedDateTime);

        // To parse ISO offset date and time using default formatter it mu respect the format DateTimeFormatter.ISO_OFFSET_DATE_TIME
        //  2007-12-03T10:15:30+01:00
        OffsetDateTime offsetDateTime = OffsetDateTime.parse("2007-12-03T10:15:30+01:00");
        System.out.println(offsetDateTime);

        // must respect the format DateTimeFormatter.ISO_OFFSET_TIME
        // 10:15:30+01:00
        OffsetTime offsetTime = OffsetTime.parse("10:15:30+01:00");
        System.out.println(offsetTime);

        // If you want the custom format then
        // formatting the string 01.06.2000 to LocalDate
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate localDate = LocalDate.parse("01.06.2000",formatter);
        System.out.println(localDate);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        // Custom Time Formatter
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH|mm|ss");
        LocalTime time = LocalTime.parse("12|20|10",timeFormatter);
        System.out.println(time);

        //Defining custom formatter for LocalDateTime object to parse
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH:mm:ss");
        LocalDateTime localDateTime1 = LocalDateTime.parse("2022.03.22, 10:40:55", dateTimeFormatter);
        System.out.println(localDateTime1);

        // Defining a custom formatter for ZonedDateTime
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH:mm:ssXXXXX '['VV']'");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2022.03.22, 10:40:55+09:00 [Asia/Tokyo]", dateTimeFormatter1);
        System.out.println(zonedDateTime1);

        // defining a custom formatter for OffsetDateTime

        DateTimeFormatter offsetDateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd, HH:mm:ssXXXXX");
        OffsetDateTime offsetDateTime1 = OffsetDateTime.parse("2022.03.22, 10:40:55+09:00" ,offsetDateTimeFormatter);
        System.out.println(offsetDateTime1);

        offsetDateTimeFormatter.format(offsetDateTime1);
    }
}
