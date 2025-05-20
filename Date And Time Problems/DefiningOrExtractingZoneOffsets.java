import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class DefiningOrExtractingZoneOffsets {
    public static void main(String[] args) {
        ZoneOffset zoneOffsetUTC = ZoneOffset.UTC;
        System.out.println(zoneOffsetUTC);

        // get system default zone
        ZoneId defaultZoneId = ZoneOffset.systemDefault();
        System.out.println(defaultZoneId);

        LocalDateTime ldt = LocalDateTime.of(2019,6,15,0,0);
        ZoneId zoneId = ZoneId.of("Europe/Bucharest");

        // Zoneoffset
        ZoneOffset zoneOffset = zoneId.getRules().getOffset(ldt);
        System.out.println("zone offset" +zoneOffset);

        // ZoneOffset can also be obtained from string
        ZoneOffset zoneOffsetString = ZoneOffset.of("+02:00");

        // adding offset to temporal object OffsetTime and OffsetDateTIme
        OffsetTime offsetTime = OffsetTime.now(zoneOffsetString);
        System.out.println("Offset time" + offsetTime);

        // ZoneOffset from hous and minutes
        ZoneOffset zoneOffsetFromHoursMinutes = ZoneOffset.ofHoursMinutes(8,30);
        System.out.println(zoneOffsetFromHoursMinutes);

        ZoneOffset zoneOffsetOfMinutes = ZoneOffset.ofTotalSeconds(2000);
        System.out.println(zoneOffsetOfMinutes);

    }
}
