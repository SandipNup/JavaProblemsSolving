import java.time.*;
import java.time.temporal.ChronoUnit;

public class DifferenceBetweenTwoDates {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2018,1,1);
        LocalDate localDate1 = LocalDate.of(2019,3,1);

        Period period = Period.between(localDate,localDate1);
        System.out.println(period);

        long days = ChronoUnit.DAYS.between(localDate,localDate1);
        System.out.println(days);

        long years = ChronoUnit.YEARS.between(localDate,localDate1);
        System.out.println("Years: " + years);

        long months = ChronoUnit.MONTHS.between(localDate,localDate1);
        System.out.println("Months: " + months);


        // using until method of Temporal

        Period period1 = localDate.until(localDate1);
        System.out.println("Years: " + period1.getYears() + "Months: " + period1.getMonths() + "Days " + period1.getDays());

        long days1 = localDate1.until(localDate1, ChronoUnit.DAYS);
        System.out.println(days1);

        long months1 = localDate.until(localDate1, ChronoUnit.MONTHS);
        System.out.println(months1);

        long years1 = localDate.until(localDate1, ChronoUnit.YEARS);
        System.out.println(years1);


        // Convert Method

        LocalDateTime ldt1 = LocalDateTime.of(2019,8,1,22,15,15);
        LocalDateTime ldt2 = LocalDateTime.of(2019,8, 1, 23,15,15);

        // lets see the difference between two dates
        long differenceBetween = ChronoUnit.MINUTES.between(ldt1,ldt2);
        System.out.println(differenceBetween);

        //using until method

        long differenceInHours = ldt1.until(ldt2, ChronoUnit.HOURS);
        System.out.println(differenceInHours);


        //
        ZonedDateTime zonedDateTime = ldt1.atZone(ZoneId.of("Asia/Kathmandu"));
        ZonedDateTime zonedDateTime1 = zonedDateTime.withZoneSameInstant(ZoneId.of("Australia/Perth")).plusHours(1);

        // diffeterence in time in two different zone
        long minutes = ChronoUnit.MINUTES.between(zonedDateTime, zonedDateTime1);
        System.out.println(minutes);
        // using until method
        long hours = zonedDateTime.until(zonedDateTime1, ChronoUnit.HOURS);
        System.out.println(hours);

        ZonedDateTime zdt1 = ldt1.atZone(ZoneId.of("Australia/Perth"));
        ZonedDateTime zdt2 = ldt2.atZone(ZoneId.of("Asia/Kathmandu"));

        long hours1 = zdt1.until(zdt2, ChronoUnit.HOURS);
        System.out.println(hours1);

        long minutes1 = ChronoUnit.DAYS.between(zdt1,zdt2);
        System.out.println(minutes1);

    }
}
