import java.time.LocalDate;

public class IteratingRangeOfDates {

    public static void loopingThroughDatesJDK8(){
        LocalDate dateBefore = LocalDate.of(2018,8,9);
        LocalDate dateAfter = LocalDate.of(2019,05,10);

        int count = 0;
        for(LocalDate date=dateBefore; date.isBefore(dateAfter); date=date.plusDays(1)){
            System.out.println(date);
            count++;
        }
        System.out.println(count);
    }

    public static void loopingThoughDateJDK9(){
        LocalDate dateBefore = LocalDate.of(2018,8,9);
        LocalDate dateAfter = LocalDate.of(2019,05,10);

        dateBefore.datesUntil(dateAfter).forEach(System.out::println);
    }

    public static void main(String[] args) {
        loopingThoughDateJDK9();
    }
}
