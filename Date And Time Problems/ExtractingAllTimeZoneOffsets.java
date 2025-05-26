import java.time.*;
import java.util.Set;

public class ExtractingAllTimeZoneOffsets {
    public static void main(String[] args) {
        ZoneOffset zoneOffset = ZoneOffset.UTC;
        System.out.println(zoneOffset);

        // system default zone can obtained through ZoneOffset
        ZoneId defaultZoneId = ZoneOffset.systemDefault();
        System.out.println(defaultZoneId);

        LocalDateTime ldt = LocalDateTime.now();
        ZoneId zoneId = ZoneId.of("Asia/Kathmandu");

        ZoneOffset zoneOffset1 = zoneId.getRules().getOffset(ldt);
        System.out.println(zoneOffset1);

        ZoneOffset zoneOffset2 = ZoneOffset.of("+02:00");
        System.out.println(zoneOffset2);

        OffsetTime offsetTime = OffsetTime.now(zoneOffset2);
        System.out.println(offsetTime);

        OffsetDateTime offsetDateTime = OffsetDateTime.now(zoneOffset2);
        System.out.println(offsetDateTime);

        ZoneOffset zoneOffset3 = ZoneOffset.ofHoursMinutes(5, 45);
        System.out.println(zoneOffset3);

        // Printing all the zone offset in all time zone

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        LocalDateTime now = LocalDateTime.now();

        for(String zoneIds : allZoneIds){
            System.out.println(zoneIds + " offset " + ZoneId.of(zoneIds).getRules().getOffset(now));
        }

    }
}
