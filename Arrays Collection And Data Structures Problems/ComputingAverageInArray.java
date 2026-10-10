import java.util.Arrays;
import java.util.stream.Stream;

public class ComputingAverageInArray {

    public static double findAverage(int[] arr){
        return  findSum(arr) / arr.length;
    }

    public static double findSum(int[] arr){
        double sum = 0;
        for(int i: arr){
            sum += i;
        }
        return sum;
    }

    public static double findAverageUseStream(int[] arr){
        return Arrays.stream(arr).average().getAsDouble();
    }

    public static void main(String[] args) {
        int[] arr = {5,4,2,1,6,7,8};

        System.out.println("Average of array " + Arrays.toString(arr) + " is :" +  findAverage(arr));
        System.out.println("Average of array " + Arrays.toString(arr) + " using findAverageUseStream is :" +  findAverageUseStream(arr));
    }
}
