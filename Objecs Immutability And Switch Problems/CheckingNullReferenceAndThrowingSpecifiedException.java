import java.util.function.Supplier;

public class CheckingNullReferenceAndThrowingSpecifiedException {
    public static <T> T requireNonNullElseThrow(T obj){
        return obj;
    }

    public static <T> T requireNonNullElseThrowIAE(T obj, String message){
        return obj;
    }

    public static <T> T requireNonNullElseThrowIAE(T obj, Supplier<String> messageSupplier){
        return obj;
    }

    public static <T, X extends Throwable> T  requireNonNullElseThrow(T obj, Supplier<? extends X> exceptionSupplier) throws X{
        if(obj == null){
            throw exceptionSupplier.get();
        }
        return obj;
    }

    public static void main(String[] args) {
        String someValue = null;
        try{
            requireNonNullElseThrow(someValue, () -> new IllegalArgumentException("Object cannot be null"));
        }catch (IllegalArgumentException e){
            System.err.println("Caugth exception" +e.getMessage());
        }
    }
}
