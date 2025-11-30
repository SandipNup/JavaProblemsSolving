import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class FindingOnlyTheFirstIndex {
    public static int findIndexOfElement(int[] arr, int toFind){
        for(int i =0; i<arr.length; i++){
            if(arr[i] == toFind) return i;
        }
        return -1;
    }

    // using java8 function style for the same thing
    public static int findIndexOfElementFunctionalStyle(int[] arr, int toFind){
        return Arrays.stream(arr).filter((obj) -> obj == toFind).findFirst().orElse(-1);
    }

    // findingIndexOfElement in array of object
    public static <T>int fistIndexOfElementInObject(T[] arr, T objToFind){
        for(int i =0; i<arr.length; i++){
            if(arr[i].equals(objToFind)) return i;
        }
        return -1;
    }

    // converting array to list and using indexOf method
    public static <T> int findIndexOfElementInObjectToList(T[] arr, T obj){
        List<T> list = Arrays.stream(arr).toList();
        return  list.indexOf(obj);
    }

    // Using comparator to find the index of first Element in object
    public static <T> int findIndexOfElementInObjectUsingComparator(T[] arr, T objToContain, Comparator<T> comparator) {
        for(int i =0; i< arr.length; i++){
            if(comparator.compare(arr[i],objToContain) == 0) return i;
        }
        return -1;
    }

    // Using comparator to find the index of first Element in object using function style
    public static <T> int findIndexOfElementInObjectUsingComparatorPlusFunctional(T[] arr, T objToContain, Comparator<T> comparator) {
       return IntStream.range(0,arr.length).filter(  i -> comparator.compare(arr[i], objToContain) == 0).findFirst().orElse(-1);
    }
}
