package DateTimeAPIGeeksForGeeks;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class JavaDateTimeApiExample1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);

        // the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);

        //to get both date and time
        LocalDateTime current = LocalDateTime.now();
        System.out.println(current);

        // to print in particular format

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy");
        String formattedDate = date.format(dateFormatter);
        System.out.println(formattedDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy  HH:mm:ss");
        String formattedDateTime = current.format(dateFormatter);
        System.out.println(formattedDateTime);


        Month month = current.getMonth();
        int day = current.getDayOfMonth();
        int seconds = current.getSecond();

        System.out.println("Month : " + month + "\n" +
                        "Day : " + day + "\n"+
                        "Seconds : " + seconds + "\n"
                );

        LocalDate date2 = LocalDate.of(1950,1,26);
        System.out.println("The repulic day" + date2);

        // printing specific date with current time
        LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
        System.out.println(specificDate);

        System.out.println("specific date time with current time");


        // Using ZonedDateTimeAndDate()
        System.out.println("Zoned Date Time example starts from here:");
        System.out.println(current.format(dateTimeFormatter));

        System.out.println("Zoned date time example");

        ZonedDateTime localZonedDateTime = ZonedDateTime.now();
        System.out.println(localZonedDateTime);
        System.out.println(localZonedDateTime.getZone());

        ZoneId zoneId = ZoneId.of("Asia/Tokyo");
        ZonedDateTime tokyoZonedDateTime = localZonedDateTime.withZoneSameInstant(zoneId);

        System.out.println(tokyoZonedDateTime);
        System.out.println(tokyoZonedDateTime.format(dateTimeFormatter));

        Period period = Period.between(date,date2);
        System.out.println(period);

        LocalTime time = LocalTime.now();

        Duration duration = Duration.of(5, ChronoUnit.HOURS);
        LocalTime timeAfter5Hours = time.plus(duration);
        System.out.println(timeAfter5Hours);

        Duration durationBet = Duration.between(timeAfter5Hours, time);
        System.out.println(durationBet.toSeconds());
    }
}
