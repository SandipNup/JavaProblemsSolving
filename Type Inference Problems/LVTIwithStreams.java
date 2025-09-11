import java.io.File;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LVTIwithStreams {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.of(1,2,3,4,5,6);
        numbers.filter(t-> t % 2 == 0).forEach(System.out::println);

        // using var keyword

        var streamOfIntegers = Stream.of(1,2,3,4,5,6);
        streamOfIntegers.filter(t-> t % 2 == 0).forEach(System.out::println);

        Stream<Path> paths = Stream.of(Path.of("/home/sandip/work/JavaProblemsSolving/Type Inference Problems/"));

        List<File> files = paths.map(p-> new File(p.toString())).collect(Collectors.toList());

        files.forEach(System.out::println);

    }
}
