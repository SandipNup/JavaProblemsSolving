import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class CheckNullReferenceInFunctionAndImperative {

    public static List<Integer> evenIntegers(List<Integer> integers){
        if (integers == null) {
            return Collections.EMPTY_LIST; 
        }
        List <Integer> even = new ArrayList<>();

        for(Integer num: integers){
            if ((num != null) && (num%2 == 0)) {
                even.add(num);
            } 
        }

        return even;
    }

    public static List <Integer> evenIntegersSolution2(List<Integer> integers) {
        List <Integer> even = new ArrayList<>();

        if (Objects.isNull(integers)){
            return Collections.EMPTY_LIST;
        }

        for (Integer i: integers){
            if((Objects.nonNull(i)) && i % 2 == 0){
                even.add(i);
            }
        }

        return even;
    }
    
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2, null, null, 4, 6, null);
        System.out.println(CheckNullReferenceInFunctionAndImperative.evenIntegers(numbers));
        System.out.println(CheckNullReferenceInFunctionAndImperative.evenIntegersSolution2(numbers));
    }
}
