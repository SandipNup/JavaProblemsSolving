package SortingAlgorithms;

import java.util.Arrays;
import java.util.Comparator;

class Melon {
    private String name;
    private int weight;

    public Melon(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public int getWeight(){
        return weight;
    }

    @Override
    public String toString(){
        return "name:" + name + " weight: " + weight;
    }
}

public class BubbleSort {


    public static void bubbleSort(int[] arr){
        int n = arr.length;

        for(int i=0; i<n-1; i++){
            boolean swapped = false;
            for(int j=0; j< n-i-1; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped) break;
        }
    }

    public static <T> void bubbleSortWithComparator(T[] arr, Comparator<? super T> comparator){
        int size = arr.length;
        for(int i =0; i< size; i++){
            boolean swapped = false;
            for(int j = 0; j < size-i-1; j++){
                if(comparator.compare(arr[j],arr[j+1]) > 0){
                    T temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }

    public static void main(String[] args){

        int[] arr = {5, 4, 9, 2, 1, 6, 7, 3, 8};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));

        Melon melon1 = new Melon("Melon1", 2);
        Melon melon2 = new Melon("melon2", 1);
        Melon melon3 = new Melon("melon3", 6);
        Melon melon4 = new Melon("melon4", 3);
        Melon melon5 = new Melon("melon5", 5);
        Melon melon6 = new Melon("melon6", 4);

        Melon[] melons = {melon1, melon2, melon3, melon4, melon5, melon6};
        Comparator<Melon> melonComparator = Comparator.comparing(Melon::getWeight);
        bubbleSortWithComparator(melons, melonComparator);
        System.out.println(Arrays.toString(melons));

    }
}
