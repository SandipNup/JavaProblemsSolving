public class UsingVarWithPrimitiveTypes {

    public static void main(String[] args) {
        // explicit declaration
        boolean valid = true;
        char c = 'c';

        // replace above explict with with LVTI
        var valid1 = true;
        var c1 = 'c';

        //explict declation
        int intNumber = 10;
        long longNumber = 10;
        float floatNumber = 10;
        double doubleNumber = 10;

        //using var keyword
        var intNumber1 = 10;
        var longNumber1 = 10;
        var floatNumber1 = 10;
        var doubleNumber1 = 10;


        printType(intNumber1);
        printType(longNumber1);
        printType(floatNumber1);
        printType(doubleNumber1);

        //using LVTI give it all as integer to solve this problem you can use explict java Literals

        var intNumber2 = 10;
        var longNumber2 = 10L;
        var floatNumber2 = 10f;
        var doubleNumber2 = 10D;
        var byteType = (byte) 10;
        var shortType = (short) 10;
        var char1 = 'c';
        var bool = true;

        var test = 9.90F;
        printType(test);


        System.out.println();

        printType(intNumber2);
        printType(longNumber2);
        printType(floatNumber2);
        printType(doubleNumber2);


    }

    public static void printType(Object obj){
        System.out.println(obj.getClass().getSimpleName());
    }

}
