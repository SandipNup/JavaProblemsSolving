import java.util.Scanner;

class Player1 {
    private final int id;

    private final String name;

    private PlayerTypes playerTypes;

    private static final Scanner sc = new Scanner(System.in);

    public Player1(int id, String name, PlayerTypes playerTypes) {
        this.id = id;
        this.name = name;
        this.playerTypes = playerTypes;
    }

    public static Player1 createPlayer( PlayerTypes playerTypes){
        System.out.println("Please Enter Player Name: ");
        String name = sc.nextLine();
        System.out.println("Please Enter Player Number: " );
        int id = sc.nextInt();
        sc.nextLine();
        return new Player1(id, name, playerTypes);
    }

    @Override
    public String toString() {
        return "Player1{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", playerTypes=" + playerTypes +
                '}';
    }
}

public class SwitchExpressionExampleOldSchool1 {

    public static void main(String[] args) {
        try{
            Player1 player11 = createPlayerSwitchOldSchoolBeforeJDK12(PlayerTypes.TENNIS);
            System.out.println(player11);
        }catch (Exception e){
            System.out.println("Exception Occurred");
        }
        Player1 player12 = createPlayerSwitchInJDK12(PlayerTypes.TENNIS);
        System.out.println(player12);

    }



    public static Player1 createPlayerSwitchInJDK12(PlayerTypes playerTypes){
        return switch (playerTypes){
            case TENNIS -> Player1.createPlayer(PlayerTypes.TENNIS);
            case SNOOKER -> Player1.createPlayer(PlayerTypes.SNOOKER);
            case FOOTBALL -> Player1.createPlayer(PlayerTypes.FOOTBALL);
            case UNKNOWN -> Player1.createPlayer(PlayerTypes.UNKNOWN);
            default-> throw new IllegalArgumentException("Invalid Player Types");
        };
    }

    public static Player1 createPlayerSwitchJDK12Example2(PlayerTypes playerTypes){
        return switch (playerTypes) {
            case TENNIS, FOOTBALL -> Player1.createPlayer(PlayerTypes.TENNIS);
            case SNOOKER->Player1.createPlayer(PlayerTypes.FOOTBALL);
            case UNKNOWN->Player1.createPlayer(PlayerTypes.UNKNOWN);
            default ->
                throw new IllegalArgumentException(
                        "Invalid player type: " + playerTypes);
        };
    }

    public static Player1 createPlayerSwitchOldSchoolBeforeJDK12(PlayerTypes playerTypes) throws Exception {
        Player1 player11 = null;
        switch (playerTypes){
            case TENNIS:
                player11 = Player1.createPlayer(PlayerTypes.TENNIS);
                break;
            case SNOOKER:
                player11 = Player1.createPlayer(PlayerTypes.SNOOKER);
                break;
            case FOOTBALL:
                player11 = Player1.createPlayer(PlayerTypes.FOOTBALL);
                break;
            case UNKNOWN:
                player11 = Player1.createPlayer(PlayerTypes.UNKNOWN);
                break;
            default:
                throw new Exception("Invalid Player Type. Please choose the correct player type");
        }

        return player11;
    }
}
