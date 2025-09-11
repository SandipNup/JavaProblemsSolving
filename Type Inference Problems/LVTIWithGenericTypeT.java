import java.util.ArrayList;
import java.util.List;

public class LVTIWithGenericTypeT {

    public static <T extends Number> T add (T t){
        T temp = t;
        return temp;
    }

    public static <T extends Number> T add (T t1, T t2){
        var t11 = t1;
        var t21 = t2;
        return t1;
    }

    public static <T extends Number> T add1(T t1){
        List<T> numberList = new ArrayList<>();
        numberList.add(t1);
        numberList.add((T) Integer.valueOf(3));

        return numberList.get(0);
    }

    // replacing add1 method by
    public <T extends Number> T add3(T t) {
        var numberList = new ArrayList<T>();
        numberList.add(t);
        numberList.add((T) Integer.valueOf(3));
        numberList.add((T) Double.valueOf(3.9));
        // error: incompatible types: String cannot be converted to T
//        numberList.add("5");
        return numberList.get(0);
    }

    public static void main(String[] args){}
}
