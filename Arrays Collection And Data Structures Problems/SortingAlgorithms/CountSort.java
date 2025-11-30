package SortingAlgorithms;

import java.util.Arrays;

public class CountSort {


    // Count Sort Stable Version with new Array
    public static void countSortStable(int[] arr){
        int n = arr.length;
        // Step 1: Find min and max
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) min = arr[i];
            else if (arr[i] > max) max = arr[i];
        }

        // Step 2: Count occurrences
        int[] count = new int[max - min + 1];
        for (int i = 0; i < n; i++) {
            count[arr[i] - min]++;
        }

        // Step 3: Cumulative count (prefix sum)
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }

        // Step 4: Build output array (go backwards for stability)
        int[] output = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            int value = arr[i];
            int position = count[value - min] - 1;
            output[position] = value;
            count[value - min]--;
        }
        System.arraycopy(output, 0, arr, 0, n);

    }


    // In Place Array Version of Count Sort when the same array passed is returned but does not work for
    // negative integers
    public static void countSort(int[] arr){
        int min = arr[0];
        int max = arr[0];
        int n = arr.length;

        for(int i =0; i<n; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        int[] count = new int[max-min+1];
        for(int i =0; i<n; i++){
            count[arr[i]-min]++;
        }
//        System.out.println(Arrays.toString(count));

        int sortedTill = 0;
        for(int i =0; i<count.length; i++){
            while(count[i] > 0){
                arr[sortedTill++] = i + min;
                count[i]--;
            }
        }
    }

    public static int[] setupTestArray(){
        return new int[]{3,1,6,2,7,8,4,5,6};
    }

    public static int[] setupNegativeTestArray(){
        return new int[]{3,-1,6,2,-7,8,4,-5,6};
    }

    public static void countSortStableVersion(){

    }

    public static void main(String[] args) {
        int[] arr1 = setupTestArray();
        countSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2NegativeArr = setupNegativeTestArray();
        countSortStable(arr2NegativeArr);
        System.out.println(Arrays.toString(arr2NegativeArr));
    }
}
