import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CreatingStreamFromArray {

    public static void main(String[] args) {
        String[] arr = {"Sandip", "Neupane", "Saru, Karki", "Enish", " Khatri"};

        //  create a stream of arr
        Stream<String> streamString = Arrays.stream(arr);

        // to create stream from subarray
        Stream<String> strStream2 = Arrays.stream(arr,0,4);

        System.out.println(strStream2.getClass());

        // the same case passing through the list can be written as
        Stream<String> strStream3 = Arrays.asList(arr).stream();
        Stream<String> strStream4 = Arrays.asList(arr).subList(0,2).stream();

        // Another was to create stream is using Of method
        Stream<String> strStream6 = Stream.of(arr);
        Stream<String> strStream7 = Stream.of("abc", "def", "efg", "hij");

        // Creating an array from stream can be done by using Stream.toArray()
        String[] arrFromStream = strStream2.toArray(String[]::new);

        // Working with array of primitive types
        int[] integers = {2, 3, 4, 6,1, 5};

        // Using Arrays.stream() in Integer arrays give IntStream

        IntStream intStream = Arrays.stream(integers);
        System.out.println(intStream.sum());

        // IntStream class also provide of() method for IntStream
        IntStream intStream2 = IntStream.of(integers);
        System.out.println(intStream2.count());

        // to create an stream for a range from 0 to length of array
        IntStream range1 = IntStream.range(0, integers.length);
        range1.forEach(System.out::println);
        IntStream range2 = IntStream.rangeClosed(0, integers.length);
        range2.forEach(System.out::println);
    }
}
