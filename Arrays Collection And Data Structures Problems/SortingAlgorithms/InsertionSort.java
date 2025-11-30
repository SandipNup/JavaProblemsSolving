package SortingAlgorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Player {
    private String name;
    private int age;
    private List<Integer> playedNationalGames;

    public Player(String name, int age, List<Integer> playedNationalGames) {
        this.name = name;
        this.age = age;
        this.playedNationalGames = playedNationalGames;
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

    public List<Integer> getPlayedNationalGames() {
        return playedNationalGames;
    }

    public void setPlayedNationalGames(List<Integer> playedNationalGames) {
        this.playedNationalGames = playedNationalGames;
    }

    public int getYearsCountPlayedInNationalGames(){
        return this.playedNationalGames.size();
    }

    @Override
    public String toString() {
        return this.name + this.age + "Played " + (!playedNationalGames.isEmpty() ? playedNationalGames.size(): "No Game") + " games";
    }
}



public class InsertionSort {

    public static void insertionSort(int[] arr){
        int n = arr.length;

        for(int i =1; i < n; i++){

            int key = arr[i];
            int j = i-1;

            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;

        }
    }

    public static void insertionSort2WithForLoop(int[] arr){
        int n = arr.length;
        for(int i =1; i< n; i++){
            int key = arr[i];
            int j;

            for(j=i-1; j >= 0 && arr[j] > key; j--){
                arr[j+1] = arr[j];
            }
            arr[j+1] = key;
        }
    }


    public static <T> void insertionSortWithComparator(T[] arr, Comparator<? super T> comparator){
        int n = arr.length;

        for(int i =1; i< n; i++){
            T key = arr[i];
            int j = i-1;

            while(j >=0 && comparator.compare(arr[j], key) > 0){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    private static Player[] createPlayers(){
        Player p1 = new Player("Saru",6 , Arrays.asList(2015, 2016, 2017,2018));
        Player p2 = new Player("Sandip",5 , Arrays.asList(2015, 2016));
        Player p3 = new Player("Sagar",4 , Arrays.asList(2015, 2016, 2017,2018, 2019,2020));
        Player p4 = new Player("ccir",3 , Arrays.asList(2019,2020,2018));
        Player p5 = new Player("Enish",2 , Arrays.asList(2018));
        Player p6 = new Player("Ishowr",1 , Arrays.asList(2015, 2016, 2017));
        return new Player[]{p1,p2,p3,p4,p5,p6};
    }

    public static void main(String[] args) {
        int[] arr = {9, 8, 3, 6, 7, 5, 4, 2};
//        insertionSort(arr);
//        System.out.println("Sorted Print:" + Arrays.toString(arr));
        insertionSort2WithForLoop(arr);



//        Arrays.sort(arr);
//        Arrays.parallelSort(arr);
        System.out.println("For Loop Insertion Sort:" + Arrays.toString(arr));

//      Testing by sorting Integers
        Integer[] arr2 = {9, 8, 3, 6, 7, 5, 4, 2};
        Comparator<Integer> comp = Integer::compare;

        insertionSortWithComparator(arr2, comp);
        System.out.println(Arrays.toString(arr2));

        Comparator<Player> comp1 = Comparator.comparing(Player::getName, String.CASE_INSENSITIVE_ORDER);
        Comparator<Player> comp2 = Comparator.comparing(Player::getYearsCountPlayedInNationalGames).thenComparing(comp1);
        Player[] players = createPlayers();
        insertionSortWithComparator(players, comp2);
        System.out.println(Arrays.toString(players));
    }
}
