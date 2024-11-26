import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingDateAndTime {
    public static void main(String[] args) {
        // Formatting local date // 2024-November-25
        DateTimeFormatter localDateFormatter = DateTimeFormatter.ofPattern("yyyy-MMMM-dd");
        System.out.println(LocalDate.now().format(localDateFormatter));

        // LocalTIme Formatting
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH mm ss");
        System.out.println(LocalTime.now().format(formatter));

        // Formatting Zoned Date and Time
        DateTimeFormatter zonedFormatter = DateTimeFormatter.ofPattern("E yyyy-MM-dd HH:mm:ssz VV");
        System.out.println(zonedFormatter.format(ZonedDateTime.now()));
    }
}
