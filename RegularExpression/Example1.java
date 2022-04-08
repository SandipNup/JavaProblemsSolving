import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example1 {
    public static void main(String[] args) {
        // represents the single character

        // First way
        Pattern p = Pattern.compile(".s");

        Matcher m = p.matcher("as");
        Boolean b = m.matches();

        // 2nd way
        boolean b2 = Pattern.compile(".s").matcher("as").matches();

        //3rd way 
        boolean b3 = Pattern.matches(".s", "as");

        System.out.println(b + " " + b2 + " " + b3);
    }
}
