import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationClass {



    public static void durationTOHMSN(Duration duration){
        StringBuilder sb = new StringBuilder();
        sb.append(duration.toDays()).append("d:")
                .append(duration.toHoursPart()).append("h:")
                .append(duration.toMinutesPart()).append("m:")
                .append(duration.toSecondsPart()).append("m:")
                .append(duration.toNanosPart()).append("n:");
        System.out.println(sb);
    }



    public static void main(String[] args) {

        Duration fromHours = Duration.ofHours(10);
        Duration fromMinutes = Duration.ofMinutes(5);

        // alternation using of
        Duration fromMinutes2 = Duration.of(4, ChronoUnit.MINUTES);

        // Duration from LocalDateTIme

        LocalDateTime localDateTime = LocalDateTime.of(2018,3,12,4,14,20,670);

        Duration fromLocalDateTImeMinutes = Duration.ofMinutes(localDateTime.getMinute());
        LocalTime localTime = LocalTime.of(4,14,20,222);
        Duration fromLocalTime = Duration.ofDays(localDateTime.getDayOfMonth());

        //converting string duration to duration must be format of ISO8601
        Duration duration = Duration.parse("P2DT3H4M");
        System.out.println(duration);

        // Duration between two instant of time
        Instant startInstant = Instant.parse("2015-11-03T12:20:30.00Z");
        Instant endInstant = Instant.parse("2016-11-03T12:20:30.00Z");

        // Duration between instant
        Duration durationBetweenInstant = Duration.between(startInstant,endInstant);
        System.out.println(durationBetweenInstant.toSeconds());

        // Duration of time between two localDateTime objects
        LocalDateTime localDateTime1 = LocalDateTime.now();
        LocalDateTime localDateTime2 = localDateTime1.plusYears(5).plusDays(24).plusNanos(2225).plusHours(5);

        Duration duration1 = Duration.between(localDateTime1, localDateTime2);
        System.out.println(duration1);

        // Duration Between two Local Time
        LocalTime localTime1 = LocalTime.of(10,30,40,900393);
        LocalTime localTime2 = LocalTime.of(23,30,40,9494);

        Duration durationBetweenTime = Duration.between(localTime1,localTime2);
        System.out.println(durationBetweenTime);
        durationTOHMSN(duration1);
        boolean durationEndIsAfter = durationBetweenTime.isNegative();
        System.out.println(durationEndIsAfter);
    }
}
