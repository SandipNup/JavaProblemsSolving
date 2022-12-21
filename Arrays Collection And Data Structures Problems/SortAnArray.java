import java.util.Arrays;

public class SortAnArray {

    public static int[] sortAnArray(int[] ints){
        int[] sortedArray = new int[ints.length];

        for(int i=0; i< ints.length; i++){
            sortedArray[i] = ints[i];
        }

        int temp;
        boolean flag = true;

        while(flag){
            flag = false;
            for (int i =0; i< sortedArray.length -1; i++){
                if(sortedArray[i] < sortedArray[i+1]){
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {
        int[] myArr = {1,2,5,6,3};
        System.out.println(Arrays.toString(sortAnArray(myArr)));
    }
}
