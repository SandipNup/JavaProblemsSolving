import java.util.Arrays;

public class FillingAndSettingAnArray {

    private static void fillArrayWIthForLoop(int[] arr, int fillVal){
        for(int i =0; i<arr.length; i++){
            arr[i] = fillVal;
        }
    }

    public static void applyGeneratorFunction(int[] arr){
        for(int i=0; i< arr.length; i++){
            arr[i] = arr[i] * 5;
        }
    }

    // Using setAll to pass the generatorFunction

    public static void applyGeneratorFunctionSetAll(int[] arr){
        Arrays.setAll(arr, i-> {
            if(arr[i]  == 0){
                return 5;
            }else return arr[i] * 5;
        });
    }

    public static void applyGeneratorFunctionSetAllParaller(int[] arr){
        Arrays.parallelSetAll(arr, i-> {
            if(arr[i]  == 0){
                return 5;
            }else return arr[i] * 5;
        });
    }



    public static void main(String[] args) {
        int[] arrExample = new int[10];
        Arrays.fill(arrExample,2);

        System.out.println(Arrays.toString(arrExample));

        // Arrays.fill inclusive and exclusive example
        int[] arrExample3 = new int[10];
        Arrays.fill(arrExample3,0,5,2);
        System.out.println(Arrays.toString(arrExample3));

        int[] arrExample2 = new int[10];
        fillArrayWIthForLoop(arrExample2,5);
        System.out.println(Arrays.toString(arrExample2));

        int[] arr3 = new int[10];
        Arrays.fill(arr3, 1, 8, 3);
        System.out.println(Arrays.toString(arr3));
        applyGeneratorFunction(arr3);
        System.out.println("Aftger gen func "+ Arrays.toString(arr3));

        int[] arr4 = new int[10];
        Arrays.fill(arr4, 1, 8, 2);
        System.out.println(Arrays.toString(arr4));
        applyGeneratorFunctionSetAllParaller(arr4);
        System.out.println("Aftger gen func "+ Arrays.toString(arr4));


    }
}
