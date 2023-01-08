import java.util.function.BinaryOperator;

public class ComputingMinimumAndMaximumOfTwoNumbers {

    // computing min and max before jdk 8

    public static void computeMaxAndMin(){
        int i1 = -45;
        int i2 = -11;
        int min = Math.min(i1,i2);
        int max = Math.min(i1,i2);

        Integer.min(i1,i2);

        double d1 = 1;
        double d2 = 2;

        double maxd = Math.max(d1, d2);
    }

    public static void main(String[] args) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
//
//        int z = a +b ;
//        Math.addExact(a, b);

        // functional style programming

//        BinaryOperator<Integer> opt = Math::addExact;
//
//        opt.apply(a,b);

        String stra = "2250000";

        int result = Integer.parseUnsignedInt(stra, Character.MAX_RADIX);
        System.out.println(stra);

    }


}
