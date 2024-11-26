package DateTimeAPIGeeksForGeeks;

import java.time.Clock;

public class UsingJavaClockClass {
    public static void main(String[] args) {
        Clock clock = Clock.systemUTC();
        System.out.println(clock.instant());
        System.out.println(Clock.systemDefaultZone());
    }
}
