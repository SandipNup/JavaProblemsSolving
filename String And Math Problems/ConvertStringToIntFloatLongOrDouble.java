import java.text.MessageFormat;

public class ConvertStringToIntFloatLongOrDouble {
    public static String integer_var = "123";
    public static String long_var = "4567838383";
    public static String double_var = "123.3355D";
    public static String float_var = "123.456F";


    // solution for converting string to int, double, long, float
    
    public static void solution1() {
        int toInt = Integer.parseInt(integer_var);
        float toFloat = Float.parseFloat(float_var);
        double toDouble = Double.parseDouble(double_var);
        long toLong = Long.parseLong(long_var);

        String result = MessageFormat.format("{0} int \n{1}float \n{2}double \n{3}long", toInt, toFloat, toDouble, toLong);

        System.out.println(result);
    }

    // solution for converting string to Integer, Float, Long, Double object
    public static void solution2(){
        Integer toInt = Integer.valueOf(integer_var);
        Float toFloat = Float.valueOf(float_var);
        Double toDouble = Double.valueOf(double_var);
        Long toLong = Long.valueOf(long_var);

        String result = MessageFormat.format("{1} int \n{2}float \n{3}double \n{4}long", toInt, toFloat, toDouble, toLong);

        System.out.println(result);

    }

    public static void main(String[] args) {
        ConvertStringToIntFloatLongOrDouble.solution1();
        ConvertStringToIntFloatLongOrDouble.solution2();
    }
}
