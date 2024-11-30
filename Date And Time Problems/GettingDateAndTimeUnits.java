import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.Set;

public class GettingDateAndTimeUnits {
    public static void getUnitsRelyingOnGetMethods(LocalDateTime ldt){
        int year = ldt.getYear();
        int month = ldt.getMonthValue();
        int day = ldt.getDayOfMonth();
        int hour = ldt.getHour();
        int minute = ldt.getMinute();
        int seconds = ldt.getSecond();
        int nano = ldt.getNano();

        System.out.println(
            year + "= Year" + "\n" +
            month + "= month" + "\n" +
            day + "= day" + "\n" +
            hour + "= hour" + "\n" +
            minute + "= minute" + "\n" +
            seconds + "= seconds" + "\n" +
            nano + "= nano" + "\n"
        );
    }

    public static void getUnitsRelyingOnGetWithTemporalField(LocalDateTime ldt){
        int year = ldt.get(ChronoField.YEAR);
        int month = ldt.get(ChronoField.MONTH_OF_YEAR);
        int day = ldt.get(ChronoField.DAY_OF_MONTH);
        int hour = ldt.get(ChronoField.HOUR_OF_DAY);
        int minute = ldt.get(ChronoField.MINUTE_OF_HOUR);
        int seconds = ldt.get(ChronoField.SECOND_OF_MINUTE);
        int nano = ldt.get(ChronoField.NANO_OF_SECOND);

        System.out.println(
                year + "= Year" + "\n" +
                        month + "= month" + "\n" +
                        day + "= day" + "\n" +
                        hour + "= hour" + "\n" +
                        minute + "= minute" + "\n" +
                        seconds + "= seconds" + "\n" +
                        nano + "= nano" + "\n"
        );
    }

    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        getUnitsRelyingOnGetMethods(ldt);

        getUnitsRelyingOnGetWithTemporalField(ldt);

        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        System.out.println(zoneIds);

        Iterator<String> setIterator = zoneIds.iterator();
        while (setIterator.hasNext()){
            LocalDateTime ldt1 = LocalDateTime.now();
            ZonedDateTime zdt = ldt1.atZone(ZoneId.of(setIterator.next()));
            System.out.println(zdt);
//            String utcOffset = zdt.getOffset().getId().replace("Z","+00:00");
//            System.out.println(utcOffset);
        }

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        // Get current date and time
        ZonedDateTime now = ZonedDateTime.now();

        // Print current date and time in all time zones
        for (String zoneId : allZoneIds) {
            ZonedDateTime zonedDateTime = now.withZoneSameInstant(ZoneId.of(zoneId));
            System.out.printf("Time Zone: %s | Date-Time: %s%n", zoneId, zonedDateTime);
        }
    }
}
