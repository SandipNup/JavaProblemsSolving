import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class ComputingMinimumAndMaximumFromArray {

    public static class Melon implements Comparable<Melon>{
        private String type;
        private int weight;

        public Melon(String type, int weight){
            this.type = type;
            this.weight = weight;
        }

        public int getWeight(){
            return weight;
        }

        public void setWeight(int weight){
            this.weight = weight;
        }

        public String getType(){
            return type;
        }

        public void setType(String type){
            this.type = type;
        }

        @Override
        public int compareTo(Melon m){
//            Melon melon = (Melon) m;
            return Integer.compare(this.weight, m.weight);
        }

        @Override
        public String toString(){
            return this.type + "******" + this.weight;
        }

//        @Override
//        public int compareTo(Object object) {
//            return 0;
//        }
    }

    public static int findMax(int[] arr){
        int max = arr[0];

        for(int i: arr){
            if( i > max){
                max = i;
            }
        }
        return  max;
    }

    public static int findMaxWithStream(int[] arr){
        // max method returns OptionInt, OptionalLong, Optional Double based on the type of array
        return Arrays.stream(arr).max().getAsInt();
    }

    public static <T extends  Comparable<T>> Melon findMaxMelon(Melon[] arr){

        Melon max = arr[0];

        for(Melon m: arr){
            if(m.compareTo(max) > 0){
                max = m;
            }
        }

        return max;
    }

    public static <T> T findMaxMelon(T[] arr, Comparator<T> comp){
        T max = arr[0];
        for(T i: arr){
            if(comp.compare(i,max) > 0){
                max = i;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 4, 9, 6, 7 };

        System.out.println(findMax(arr));
        System.out.println("Find max with streams " + findMaxWithStream(arr));


        // Finding Max from an Array of objects

        Melon[] melons = {
                new Melon("cantalope", 150),
                new Melon("redmelon", 250),
                new Melon("greenmelon", 50),
                new Melon("whitemelon", 120),
                new Melon("yellowmelon", 10),
                new Melon("yellowmelon", 30),
                new Melon("zellowmelon", 20)
        };

        System.out.println(findMaxMelon(melons));

        // Using comparator to sort and array of melon

        Comparator<Melon> melonComparator = Comparator.comparing(Melon::getType);

        System.out.println(findMaxMelon(melons, melonComparator));

        //Instead of using this long method you can make use of streams

        Melon maxMelon = Stream.of(melons).max(melonComparator).get();
        System.out.println(maxMelon);

    }
}
