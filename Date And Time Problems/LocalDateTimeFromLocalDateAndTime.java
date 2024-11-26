import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeFromLocalDateAndTime {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.of(2020, 10, 1, 12, 33, 21, 675);
        System.out.println(ldt);


        // Using LocalDate and LocalTime combined to create LocalDateTime
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss a")));
    }
}
