import javax.crypto.spec.PSource;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CalculatingTheAge {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime after15Years = now.plusYears(15);
        long years = ChronoUnit.YEARS.between(now,after15Years);
        System.out.println(years);

        Period period = Period.between(now.toLocalDate(),after15Years.toLocalDate());
        long yearsFromPeriod = period.getYears();
        System.out.println(yearsFromPeriod);
    }
}
