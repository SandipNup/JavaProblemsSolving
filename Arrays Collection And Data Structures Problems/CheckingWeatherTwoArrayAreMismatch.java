import java.util.Arrays;

public class CheckingWeatherTwoArrayAreMismatch {
    public static void main(String[] args) {

        int[] arr1 = {2,5,6,8,1,3};
        int[] arr2 = {2,5,7,1,8,9};
        int[] arr3 = {3,5,4,1,6,9};
        int[] arr4 = {2,5,6,8,1,3};

        // check if arr1 and arr2 mismatched
        int indexOfFirstMisMatch = Arrays.mismatch(arr1, arr2);  // return 2

        System.out.println(indexOfFirstMisMatch + " Index of first mismatch between arr1 and arr2");

        // check if arr1 and arr4 mismatched if(it is equal it will return -1)
        int indexOfFistMisMatch = Arrays.mismatch(arr1,arr4);  // returns 1
        System.out.println(indexOfFistMisMatch + " Index of first mismatch between arr1 and arr2");

        // If two arrays are of different length and the smaller size array is the prefix of the another array
        // then it will return the size of the smaller array

        int[] arr5 = {2,5,6,8};
        int indexOfMissMatched = Arrays.mismatch(arr4, arr5);
        System.out.println("indexOfMissMatched " + indexOfMissMatched );
    }
}
