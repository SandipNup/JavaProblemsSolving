import java.sql.Array;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GettingLocalDateTimeInAllAvailableTimeZones {

    public static List<String> localDateTimeOfAllTimeZones() {
        List<String> result = new ArrayList<>();
        Set<String> zoneIds = ZoneId.getAvailableZoneIds();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS");
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        zoneIds.forEach(zoneId->{
            ZonedDateTime timeInZone = zonedDateTime.withZoneSameInstant(ZoneId.of(zoneId));
           result.add("Time in CST " + zonedDateTime.format(formatter) + "offset " + timeInZone.getOffset() +
                    "Time in time zone " + zoneId + " " + timeInZone.format(formatter));
        });

        result.forEach(System.out::println);

        return result;
    }
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        Set<String> allAvailableTimeZone = ZoneId.getAvailableZoneIds();
        System.out.println("Total Available ID's :" + allAvailableTimeZone.size());

        allAvailableTimeZone.forEach((zoneId) -> {
            result.add(zonedDateTime.withZoneSameInstant(ZoneId.of(zoneId)).toString());
        });

        result.forEach(System.out::println);
        localDateTimeOfAllTimeZones();
    }
}
