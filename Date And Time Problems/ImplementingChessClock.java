import java.io.Serial;
import java.io.Serializable;
import java.time.*;


class ChessClock extends Clock implements Serializable {

    public enum Player{
        LEFT,
        RIGHT
    }

    private Instant instantStart;
    private Instant instantLeft;
    private Instant instantRight;
    private long timeLeft;
    private long timeRight;
    private Player player;

    @Serial
    private static final long serialVersionUID = 1l;

    public ChessClock(Player player){
        this.player = player;
    }

    @Override
    public ZoneId getZone() {
        return ZoneOffset.UTC;
    }

    @Override
    public Clock withZone(ZoneId zone) {
        throw  new UnsupportedOperationException("The Chess clock only works in UTC timezone");
    }

    @Override
    public Instant instant() {
        if(this.instantStart != null){
            if(player == Player.LEFT){
                player = Player.RIGHT;
                long secondsLeft = Instant.now().getEpochSecond() - instantRight.getEpochSecond();
                instantLeft = instantLeft.plusSeconds(secondsLeft-timeLeft);
                timeLeft = secondsLeft;
            }
        }else {
            player = Player.RIGHT;

            long secondsRight = Instant.now().getEpochSecond() - instantLeft.getEpochSecond();
            instantRight = instantRight.plusSeconds(secondsRight-timeRight);
            timeRight = secondsRight;
            return instantRight;

        }
        throw new IllegalStateException("Game was not started");
    }

    public Instant gameStart() {
        if (this.instantStart == null){
            this.timeLeft = 0;
            this.timeRight = 0;
            this.instantStart = Instant.now();
            this.instantLeft = instantStart;
            this.instantRight = instantStart;
            return instantStart;
        }
        throw new IllegalStateException("Game is already started. Stop it and try again");
    }

    public Instant gameEnd(){
        if(this.instantStart != null){
            instantStart = null;
            return Instant.now();
        }

        throw new IllegalStateException("Game was not started");
    }
}

public class ImplementingChessClock {
    public static void main(String[] args) {
        // By Default java comes with four implementation of clock class
        // System Clock, Fixed Clock, Tick Clock, OffsetClock.
        // Clock class contains static method for creating instance of these 4 types of clock

        // Fixed Clock
        Clock fixed = Clock.fixed(Instant.now(), ZoneOffset.UTC);
        System.out.println(fixed);

        // Tick Clock
        Clock tick = Clock.tickSeconds(ZoneId.of("Europe/Bucharest"));
        System.out.println(tick);

        System.out.println(tick.instant());
        System.out.println(tick.millis()); // gives the millisecond of the clock instant

        ChessClock chessClock = new ChessClock(ChessClock.Player.LEFT);

        Instant start = chessClock.gameStart();

        Instant end  = chessClock.gameEnd();

        System.out.println(Duration.between(start,end).getSeconds());
    }
}
