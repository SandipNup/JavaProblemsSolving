import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LVTIToBreakUpNestedLargeChainOfExpression {
    public static void main(String[] args) {
        List<Integer> ints = List.of(1,2,1,1,2,3,4,5,3,6,8,6);

        //Avoid
        int result = ints.stream()
                .collect(Collectors.partitioningBy(i->i%2 == 0))
                .values()
                .stream().max(Comparator.comparing(List::size))
                .orElse(Collections.emptyList())
                .stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(result);

        Collection<List<Integer>> evenAndOdds = ints.stream().collect(Collectors.partitioningBy(i-> i % 2 == 0)).values();
        System.out.println(evenAndOdds);
        List<Integer> evenOrOddsss = evenAndOdds.stream().max(Comparator.comparing(List::size)).orElse(Collections.emptyList());
        System.out.println(evenOrOddsss);
        int sumEvenOrOdd = evenAndOdds.stream().flatMap(List::stream).mapToInt(Integer::intValue).sum();
        System.out.println(sumEvenOrOdd);


        // Using Var keyword

        var listOfIn = List.of(1,2,3,4,5,6,7,8,9,5,6,7,4,2,2);

        var streamOfIn = listOfIn.stream().collect(Collectors.partitioningBy(i-> i%2 == 0)).values();
        System.out.println(streamOfIn);
        var evenOrOddList = streamOfIn.stream().max(Comparator.comparing(List::size)).orElse(Collections.emptyList());
        System.out.println(evenOrOddList);
        var sumOddOrEven = evenOrOddList.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sumOddOrEven);

    }
}
