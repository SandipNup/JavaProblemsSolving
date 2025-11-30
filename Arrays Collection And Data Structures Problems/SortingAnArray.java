import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Melon {
    String name;
    int weight;

    public Melon(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String toString(){
        return name;
    }
}

public class SortingAnArray {



    public static void sortingAnArrayOfInt(Integer[] arr){
        Arrays.sort(arr);
    }
    public static void main(String[] args) {
        Integer[] arr = {1, 2,6, 3, 4, 7, 8, 2};
        sortingAnArrayOfInt(arr);
        System.out.println(Arrays.toString(arr));

        Melon melon1 = new Melon("sandip", 22);
        Melon melon2 = new Melon("saru", 21);
        Melon[] melons = {melon1, melon2};

//        Arrays.sort(melons, new Comparator<Melon>(){
//            @Override
//            public int compare(Melon m1, Melon m2) {
//                return Integer.compare(m1.weight, m2.weight);
//            }
//        });
//
//        System.out.println(Arrays.toString(melons));
//
////         using lambdas to sort melons
//
//        Arrays.sort(melons, (m1,m2) -> Integer.compare(m1.weight, m2.weight));
//
//        System.out.println(Arrays.toString(melons));

        // using parallelSort method to sort parallel
//
        Arrays.parallelSort(melons, new Comparator<Melon>() {
            @Override
            public int compare(Melon melon1, Melon melon2) {
                return (-1) * Integer.compare(melon1.weight,
                        melon2.weight);
            }
        });

        System.out.println(Arrays.toString(melons));
//
//        Arrays.parallelSort(melons, (m1,m2) -> Integer.compare(m1.weight,m2.weight) * -1);

        // to sort an array in descending order you can simply use swap the object place in
        // comparator or simply multiply the result by -1 in comparator logic

        //
        Arrays.sort(arr, Collections.reverseOrder());

        Integer[] intArr = {5,1,9,6,7,8,8,10};
        Arrays.sort(intArr, Collections.reverseOrder());
        System.out.println(Arrays.toString(intArr));
    }
}
