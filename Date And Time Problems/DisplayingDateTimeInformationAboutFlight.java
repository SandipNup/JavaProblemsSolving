import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

/* The solution that is presented in this section will display the following information
 about the 15 hours and 30 minutes flight from Perth, Australia to Bucharest, Europe:
 UTC date-time at departure and arrival
 Perth date-time at departure and arrival in Bucharest
 Bucharest date-time at departure and arriva

  Let's assume that the reference departure date-time from Perth is February 26, 2019, at
 16:00 (or 4:00 PM)
 */
public class DisplayingDateTimeInformationAboutFlight {

    public static void calculateTime(){
        LocalDateTime localDateTime = LocalDateTime.of(2019,2,26,16,0,0);
        // combine this date time with time zone of Australia / Perth
        ZonedDateTime auPerthDepart = localDateTime.atZone(ZoneId.of("Australia/Perth"));
        System.out.println(auPerthDepart);

        // Let's add the flight Time to time
        ZonedDateTime auPerthArrive =  auPerthDepart.plusHours(15).plusMinutes(30);
        ZonedDateTime euBucharestDepart = auPerthDepart.withZoneSameInstant(ZoneId.of("Europe/Bucharest"));
        System.out.println(euBucharestDepart);

        ZonedDateTime euBucharestArrive = auPerthArrive.withZoneSameInstant(ZoneId.of("Europe/Bucharest"));
        System.out.println(euBucharestArrive);

        // These time can be easily extracted as OffsetDateTime as follow
        OffsetDateTime utcAtDepart = auPerthArrive.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
        OffsetDateTime utcAtArrive= auPerthDepart.withZoneSameInstant(ZoneId.of("UTC")).toOffsetDateTime();
        System.out.println(utcAtDepart);
        System.out.println(utcAtArrive);
    }

    public static void main(String[] args) {
        calculateTime();
    }
}
