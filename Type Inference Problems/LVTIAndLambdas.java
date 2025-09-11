import java.util.function.Function;
import java.util.function.Supplier;

// java 11 allows you to use var in lambdas parameter

@FunctionalInterface
interface Square{
    int calculate(int x);
}

public class LVTIAndLambdas {
    public static void main(String[] args) {
        // cannot use var keyword with lambdas
        // following code will not compile

//        var incrementX = x -> x + 1;

        //It needs to be explicitly defined as
        Function<Integer, Integer> incrementXv1 = x-> x+1;

        // Similarly following code will not compile
//        var testException = IllegalAccessException::new;

        // It needs to be explicitly defined as
        Supplier<IllegalArgumentException> exceptionSupplier = IllegalArgumentException::new;

        Square square = (var x) -> x*x;
    }
}
