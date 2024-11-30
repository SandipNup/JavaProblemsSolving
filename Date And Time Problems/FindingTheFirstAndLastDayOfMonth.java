import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.temporal.*;

class NextSaturdayAdjuster implements TemporalAdjuster{
    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        if (dayOfWeek == DayOfWeek.SATURDAY) {
            return temporal;
        }
        if (dayOfWeek == DayOfWeek.SUNDAY) {
            return temporal.plus(6, ChronoUnit.DAYS);
        }
        return temporal.plus(6 - dayOfWeek.getValue(), ChronoUnit.DAYS);
    }

}

public class FindingTheFirstAndLastDayOfMonth {

    // get Day after certain days in
    public static void adjustDate(LocalDate date, int days){
        Period period = Period.ofDays(days);
        TemporalAdjuster ta = p -> p.plus(period);
        LocalDate endDate = date.with(ta);
        System.out.println(endDate);
        System.out.println(date.plusDays(days));
    }

    // get dates that falls on saturdays
    static TemporalAdjuster NEXT_SATURDAY
            = TemporalAdjusters.ofDateAdjuster(today -> {
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        if (dayOfWeek == DayOfWeek.SATURDAY) {
            return today;
        }
        if (dayOfWeek == DayOfWeek.SUNDAY) {
            return today.plusDays(6);
        }
        return today.plusDays(6 - dayOfWeek.getValue());
    });
    // For this solution we will reply on jdk8 Temporal and TemporalAdjuster interfaces

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2019, Month.FEBRUARY,27);

        // Now lets get the fist and last days of the feb
        LocalDate firstDayOfFeb = date.with(TemporalAdjusters.firstDayOfMonth());
        LocalDate lastDayOfFet = date.with(TemporalAdjusters.lastDayOfMonth());

        System.out.println(firstDayOfFeb);
        System.out.println(lastDayOfFet);
        adjustDate(date,21);

        LocalDate nextSat = date.with(NEXT_SATURDAY);
        System.out.println(nextSat);

        NextSaturdayAdjuster nextSaturdayAdjuster = new NextSaturdayAdjuster();
        LocalDate adjustedDate = date.with(nextSaturdayAdjuster);
        System.out.println(adjustedDate);
    }
}
