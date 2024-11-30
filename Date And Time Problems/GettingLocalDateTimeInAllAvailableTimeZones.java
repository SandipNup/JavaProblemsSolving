import java.sql.Array;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GettingLocalDateTimeInAllAvailableTimeZones {
    public static void main(String[] args) {
        List<String> result = new ArrayList<>();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();

        Set<String> allAvailableTimeZone = ZoneId.getAvailableZoneIds();
        System.out.println("Total Available ID's :" + allAvailableTimeZone.size());

        allAvailableTimeZone.forEach((zoneId) -> {
            result.add(zonedDateTime.withZoneSameInstant(ZoneId.of(zoneId)).toString());
        });

        result.forEach(System.out::println);
    }
}
