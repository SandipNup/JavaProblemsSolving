import java.time.*;
import java.time.temporal.ChronoField;

public class StartAndEndOfADay {

    public static void main(String[] args) {
        // Strat of the date

        LocalDate localDate = LocalDate.of(2018,05,9);

        // adding the starttime to the localdate can be accomplished by

        LocalDateTime ldt = localDate.atStartOfDay();
        System.out.println(ldt);

        // method 2
        LocalDateTime ldt1 = LocalDateTime.of(localDate, LocalTime.MIN);
        System.out.println(ldt1);

        // MAX time of the day can be achieved throguh
        LocalDateTime ldt2 = localDate.atTime(LocalTime.MAX);
        System.out.println(ldt2);

        // you can also combine LocalTime.MAX with date
        LocalDateTime ldt3 = LocalTime.MAX.atDate(localDate);
        System.out.println(ldt3);

        //method1 ZonedDateTime is DayLightSaving aware so to get daylight saving aware dates use the following code
        ZonedDateTime zonedDateTime = localDate.atStartOfDay(ZoneId.of("Australia/Perth"));
        System.out.println(zonedDateTime);

        //method2
        ZonedDateTime zonedDateTime1 = LocalDateTime.of(localDate,LocalTime.MAX).atZone(ZoneId.of(("Australia/Perth")));
        System.out.println(zonedDateTime1);

        //method3
        ZonedDateTime zonedDateTime2 = localDate.atTime(LocalTime.MAX).atZone(ZoneId.of("Australia/Perth"));
        System.out.println(zonedDateTime2);

        //method4
        ZonedDateTime zonedDateTime3 = LocalTime.MAX.atDate(localDate).atZone(ZoneId.of("Australia/Perth"));

        // New Example
        LocalDateTime localDateTime = LocalDateTime.of(2019,2,28,18,0,0);

        //using with method
        // start of the day using localDateTime.with method
        LocalDateTime localDateTime1 = localDateTime.with(ChronoField.NANO_OF_DAY, LocalTime.MIN.toNanoOfDay());

        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = localDateTime.with(ChronoField.HOUR_OF_DAY, 0);
        System.out.println(localDateTime2);

        //getting end of the day
        LocalDateTime localDateTime3 = localDateTime.with(ChronoField.NANO_OF_DAY, LocalTime.MAX.toNanoOfDay());
        System.out.println(localDateTime3);

        // localdate and localtime is not timezone aware
        ZonedDateTime zonedDateTime4 = localDateTime.with(ChronoField.NANO_OF_DAY, LocalTime.MIN.toNanoOfDay()).atZone(ZoneId.of("Australia/Perth"));
        System.out.println(zonedDateTime4);

        // geting ZoneDayTime end of the day using localDateTime
        ZonedDateTime zonedDateTime5 = localDateTime.with(ChronoField.NANO_OF_DAY, LocalTime.MAX.toNanoOfDay()).atZone(ZoneId.of("Asia/Kathmandu"));
        System.out.println(zonedDateTime5);

        ZonedDateTime zonedDateTime6 = ZonedDateTime.now(ZoneOffset.UTC);

        //start Of the day
        ZonedDateTime zonedDateTime7 = zonedDateTime6.toLocalDate().atStartOfDay(zonedDateTime6.getZone());
        System.out.println(zonedDateTime7);

        // ZonedDateTime end of the day
        ZonedDateTime zonedDateTime8 = zonedDateTime6.toLocalDate().atStartOfDay(zonedDateTime6.getZone());
        System.out.println(zonedDateTime8);

    }
}
