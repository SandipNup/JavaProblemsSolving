interface Weighter {
    int getWeight(Player player);
}

public class LVTIAndAnonymousClasses {


    public static void main(String[] args) {
        Weighter weighter = new Weighter() {
            @Override
            public int getWeight(Player player) {
                return 4 * 6;
            }
        };
        Player p = new Player(1,"sandip");
        int weight = weighter.getWeight(p);
        System.out.println(weight);

        // Using LVTI

        var weighter2 = new Weighter(){
            @Override
            public int getWeight(Player player) {
                return 4 * 6;
            }
        };
    }
}
