import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player{
    private int id;
    private String name;

    public Player(int id, String name){
        this.id=id;
        this.name =name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)return true;
        if(Objects.isNull(obj)) return false;
        if(getClass() != obj.getClass())return false;
        final Player player = (Player) obj;

        if(this.id != player.id) return false;
        if(!Objects.equals(this.name, player.name)) return false;
        return true;
    }

    @Override
    public int hashCode(){
        int hash = 7;
        hash = 79 * hash + this.id;
        hash = 79 * hash + Objects.hashCode(this.name);

        return hash;
    }
}

public class EqualsAndHashCode {
    public static void main(String[] args) {
        Player p1 = new Player(2, "Sandip");
        Player p2 = new Player(2, "Sandip");

        Set<Player> players = new HashSet<>();
        players.add(p1);
        players.add(p2);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println("HashSet SIze"+ players.size());
    }
}

