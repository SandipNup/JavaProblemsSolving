import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

public class ReversingAnArray {

    public static class Melon {
        String name;
        int weight;

        public Melon(String name, int weight){
            this.name = name;
            this.weight = weight;
        }

        public String toString(){
            return name + weight;
        }
    }

    // old style swapping elements in array
    public static void reverseAnArr(int[] arr){
        for(int i = 0; i<arr.length/ 2 ; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
    }

    public static void reverseAnArray(int[] arr){
        for(int left=0,right=arr.length-1; left < right; left++, right--){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
        }
    }

    public static <T> void  reverseAnArrayOfObject(T[] arr){
        for(int left = 0, right= arr.length-1; left < right; left++,right--){
            T temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
        }
    }

    public static Melon[] reverseAnArrayOfObjectUsingStreams(Melon[] arr){
        return IntStream.range(0,arr.length).mapToObj(i-> arr[arr.length-i-1]).toArray(Melon[]::new);
    }

    public static  int[] reverseUsingJava8Stream(int[] arr){
        return IntStream.range(0, arr.length).map(i-> arr[arr.length-i-1]).toArray();
    }

    public static void main(String[] args){
        int[] arr = {2, 5, 3, 6, 1, 8, 7};
        reverseAnArr(arr);
        System.out.println(Arrays.toString(arr));

        int[] arr2 = {2, 5, 3, 6, 1, 8, 7};
        System.out.println("Original: " + Arrays.toString(arr2));
        reverseAnArray(arr2);
        System.out.println("After Reverse: " + Arrays.toString(arr2));

        int[] arr3 = {2, 5, 3, 6, 1, 8, 7};
        System.out.println("Using Streams Original: " + Arrays.toString(arr3));
        int[] arr4 = reverseUsingJava8Stream(arr3);
        System.out.println("Using Streams Original: " + Arrays.toString(arr3));
        System.out.println("Using Streams After Reverse: " + Arrays.toString(arr4));
        
       Melon[] melons = {
                new Melon("cantalope", 150),
                new Melon("redmelon", 250),
                new Melon("greenmelon", 50),
                new Melon("whitemelon", 120),
                new Melon("yellowmelon", 10),
                new Melon("yellowmelon", 30),
                new Melon("zellowmelon", 20)
        };

        System.out.println("Orginal Melon" + Arrays.toString(melons));
        reverseAnArrayOfObject(melons);
        System.out.println("After Reverse Melon" + Arrays.toString(melons));



        Melon[] melons2 = {
                new Melon("cantalope", 150),
                new Melon("redmelon", 250),
                new Melon("greenmelon", 50),
                new Melon("whitemelon", 120),
                new Melon("yellowmelon", 10),
                new Melon("yellowmelon", 30),
                new Melon("zellowmelon", 20)
        };

        System.out.println("Orginal Melon Using Streams" + Arrays.toString(melons2));
        Melon[] melonsResult = reverseAnArrayOfObjectUsingStreams(melons2);
        System.out.println("After Reverse Melon Using Streams" + Arrays.toString(melonsResult));

        // If Array Is and Object we can rely on Collections.reverse() method and pass list

        Melon[] melons3 = {
                new Melon("cantalope", 150),
                new Melon("redmelon", 250),
                new Melon("greenmelon", 50),
                new Melon("whitemelon", 120),
                new Melon("yellowmelon", 10),
                new Melon("yellowmelon", 30),
                new Melon("zellowmelon", 20)
        };
        System.out.println("Collection Reverse Orginal" + Arrays.toString(melons3));
        Collections.reverse(Arrays.asList(melons3));
        System.out.println("Collection Reverse Melons Reversed" + Arrays.toString(melons3));


    }
}
