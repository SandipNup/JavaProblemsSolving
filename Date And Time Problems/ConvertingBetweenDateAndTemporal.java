import java.time.Instant;
import java.util.Date;


class DateConverters{
    public static Instant dateToInstant(Date date){
        return date.toInstant();
    }


}

public class ConvertingBetweenDateAndTemporal {
    public static void main(String[] args) {
        // Converting from Date to instant method

        Date date = new Date();
        System.out.println(date);

        Instant instantFromDate = date.toInstant();
        System.out.println(instantFromDate);

        //converting instant to date
        Date dateFromInstant = Date.from(instantFromDate);
        System.out.println(dateFromInstant);
    }
}
