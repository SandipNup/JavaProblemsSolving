import java.time.*;

public class ConversionBetweenClassExamples {
    public static void main(String[] args) {
        // Conversion between Instant and LocalDateTime since has no idea of time zone, use a zero offset UTC+0

        LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(), ZoneOffset.UTC);
        Instant instantLDT = LocalDateTime.now().toInstant(ZoneOffset.UTC);
        System.out.println(instantLDT);

        //Conversion between Instant and ZonedDate
        ZonedDateTime zdt = Instant.now().atZone(ZoneId.of("Europe/Paris"));

        Instant instantZDT= LocalDateTime.now().atZone(ZoneId.of("Europe/Paris")).toInstant();
        System.out.println(instantZDT);

        // Convert between Instant and OffsetDateTime--specify an offset of 2 hours:
        OffsetDateTime odt = Instant.now().atOffset(ZoneOffset.of("+2:00"));
        Instant instanODT = LocalDateTime.now().atOffset(ZoneOffset.of("+2:00")).toInstant();
    }
}
