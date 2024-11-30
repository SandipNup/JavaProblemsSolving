import java.time.LocalDate;
import java.time.Period;

public class PeriodClass {

    public static void main(String[] args) {

        Period period = Period.ofDays(120);
        System.out.println(period);

        // Period of 2000 years 11 month and 24 days can be obtained via
        Period periodFromUnits = Period.of(2000,11,24);

        // Period can also be obtained from LocalDate
        LocalDate localDate = LocalDate.now();
        Period periodFromLocalDate = Period.of(localDate.getYear(),localDate.getMonthValue(),localDate.getDayOfMonth());
        System.out.println(periodFromLocalDate);

        // Period can be obtained from a String object that respects the ISO-8601 period
        // formats PnYnMnD and PnW. // P2019Y2M25D
        Period periodFromString = Period.parse("P2024Y09M24D");
        System.out.println(periodFromString);


        //  The period of time between
        // March 12, 2018 and July 20, 2019 can be represented as follows:
        LocalDate startLocalDate = LocalDate.of(2018,03,12);
        LocalDate endLocalDate = LocalDate.of(2019,07,20);
        Period periodBetweenDates = Period.between(startLocalDate,endLocalDate);
        System.out.println(periodBetweenDates);

        StringBuilder sb = new StringBuilder();

        sb.append(periodBetweenDates.getYears()).append("Y:")
                .append(periodBetweenDates.getMonths()).append("M:")
                .append(periodBetweenDates.getDays()).append("D");

        System.out.println(sb);

        //Adding two periods can be accomplished via Period.plus() method as follows:
        Period p1 = Period.ofDays(5);
        Period p2 = Period.ofYears(1);

        Period p3 = p1.plus(p2);



    }

}
