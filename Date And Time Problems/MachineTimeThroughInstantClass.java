import java.time.*;
import java.time.temporal.ChronoUnit;

public class MachineTimeThroughInstantClass {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        // A similar output can be obtained with following code snipped
        OffsetDateTime offsetDateTime = OffsetDateTime.now(ZoneOffset.UTC);
        System.out.println(offsetDateTime);

        // Alternatively you can also make use of Clock class.
        Clock clock = Clock.systemUTC();
        System.out.println(clock.toString());

        // Converting string to instant
        // Any string that follows ISO-8601 standard format can be converted to Instant class
        //2019-09-24T14:33:33.1909387368Z
        Instant instant1 = Instant.parse("2019-09-24T14:33:33.190938736Z");
        System.out.println(instant1);

        // Adding/Subtracting time, to add 10 hours to the instant
        Instant instant1plus2Hour = instant1.plus(2, ChronoUnit.HOURS);
        System.out.println(instant1plus2Hour);


        // Comparing two instant object
        System.out.println(instant1plus2Hour.isAfter(instant1));
        System.out.println(instant.isBefore(instant1));

    }
}
