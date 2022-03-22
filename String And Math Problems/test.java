import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2015, 07, 17);
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")));
    }
}

