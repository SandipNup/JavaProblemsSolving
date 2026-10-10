import java.util.Arrays;
import java.util.Comparator;

public class CheckingWeatherTwoArrayAreEqual {


    private static class Player {
        private String name;
        private int age;
        private String email;

        public Player(String name, int age, String email) {
            this.name = name;
            this.age = age;
            this.email = email;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public boolean equals(Object object){
            if (this==object) return true;
            if(!(object instanceof Player otherPlayer)) return false;
            return otherPlayer.name.equalsIgnoreCase(this.name) && otherPlayer.age == this.age;
        }

        @Override
        public int hashCode(){
            return this.name.chars().sum() + this.age;
        }
    }

    public static void main(String[] args) {

        // for primitive types method you can use Arrays.equals method
        int[] integers1 = {1,2,5,4,9,8};
        int[] integers2 = {1,2,5,4,9,8};
        int[] integers3 = {1,2,5,4,9,0};

        // using Arrays.equals() method

        boolean isEqualInt1AndInt2 = Arrays.equals(integers1,integers2);
        System.out.println(isEqualInt1AndInt2? "Integer1 Array and Integer2 Array are equals": "Arrays are not equal");
        boolean isEqualInt2AndInt3 = Arrays.equals(integers2,integers3);
        System.out.println(isEqualInt2AndInt3? "Integer2 Array and Integer3 Array are equals": "Arrays are not equal");

        // Check if the segments of array is equal

        boolean hasEqualSegmentInt2AndInt3 = Arrays.equals(integers2,0,4, integers3,0, 4);
        System.out.println(hasEqualSegmentInt2AndInt3?"Arrays has equal segment": "Arrays do not have equal segment");

        // Crating players
        Player player1 = new Player("Player1", 22, "player1@gmail.com");
        Player player2= new Player("Player2", 19, "player2@gmail.com");
        Player player3 = new Player("Player3", 32, "player3@gmail.com");
        Player player4 = new Player("Player4", 12, "player4@gmail.com");
        Player player5 = new Player("Player5", 21, "player5@gmail.com");
        Player player6 = new Player("Player6", 23, "player6@gmail.com");

        Player[] playersArray1 = {player1, player2, player3};
        Player[] playersArray2 = {player1, player2, player3};
        Player[] playersArray3 = {player4, player2, player3};
        Player[] playersArray4 = {player5, player2, player3};
        Player[] playersArray5 = {player5, player2, player4};

        // uses  Arrays.equals uses equals method by default to determine the equality of the array

        boolean isEqualPlayer1ArrAndPlayer2Arr = Arrays.equals(playersArray1, playersArray2);
        System.out.println(isEqualPlayer1ArrAndPlayer2Arr? "Player1 Array and Player2 Array are equals":
                "Player1 and Player2 array are not equal");

        boolean isEqualPlayer2ArrAndPlayer3Arr = Arrays.equals(playersArray2, playersArray3);
        System.out.println(isEqualPlayer2ArrAndPlayer3Arr? "Player2 Array and Player3 Array are equals":
                "Player2 and Player3 array are not equal");

        // Using int from index and int To Index in player object Array
        boolean hasEqualSegmentPlayerArray3AndPlayerArray4 = Arrays.equals(playersArray3,1,3, playersArray4,1,3);
        System.out.println(hasEqualSegmentPlayerArray3AndPlayerArray4? "Has Equal Segement":
                "Doesn't have equal segment");

        boolean hasEqualSegmentPlayerArray4AndPlayerArray5 = Arrays.equals(playersArray4,1,3, playersArray5,1,3);
        System.out.println(hasEqualSegmentPlayerArray4AndPlayerArray5? "Has Equal Segement":
                "Doesn't have equal segment");

        // using comparator check if arrays are equals
        Comparator<Player> comparatorByName = Comparator.comparing(Player::getName);
        boolean isEqualPlayer1ArrAndPlayer2ArrByName = Arrays.equals(playersArray1, playersArray2, comparatorByName);
        System.out.println(isEqualPlayer1ArrAndPlayer2ArrByName? "Player1 Array and Player2 Array are equals":
                "Player1 and Player2 array are not equal");

        boolean equalsWithComparatorSegment = Arrays.equals(playersArray1, 1, 3, playersArray3, 1, 3, comparatorByName);
        System.out.println(equalsWithComparatorSegment? "Player1 Array and Player3 Array are equals":
                "Player1 and Player2 array are not equal");
    }
}
