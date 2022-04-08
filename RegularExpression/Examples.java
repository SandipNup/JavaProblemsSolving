import java.time.chrono.ThaiBuddhistChronology;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examples {

    public static void example1(){
        System.out.println(Pattern.matches(".s", "as"));
        System.out.println(Pattern.matches(".s", "AM"));
        System.out.println(Pattern.matches(".s", "mst"));
        System.out.println(Pattern.matches(".s", "amms"));
        System.out.println(Pattern.matches("...s", "amms"));

    }

    public static void example2(){
        System.out.println(Pattern.matches("[abc]", "ax")); // false
        System.out.println(Pattern.matches("[abc]", "a")); // True
        System.out.println(Pattern.matches("[abc]", "ammmnnn")); // false
    }

    public static void example3(){
        System.out.println(Pattern.matches("[abc]?", "a"));
        System.out.println(Pattern.matches("[abc]+", "abcddd"));
        System.out.println(Pattern.matches("[abc]+", "abcaacc"));
        System.out.println(Pattern.matches("[abc]+", "abcaaccddd"));
        System.out.println(Pattern.matches("[abc]", ""));
    }

    public static Boolean alphaNumericCHeck(String str){
        System.out.println("Alpha numeric check");
        return Pattern.matches("[a-zA-Z0-9]*", str);
    }

    public static Boolean TenDigitNumericCharacter(String str){
        System.out.println("Ten digit numeric character");
        return Pattern.matches("[0-9]{10}", str);
    }

    public static void finderExample(){
        Scanner sc = new Scanner(System.in);
        sc.close();
        while(true){
            System.out.println("Enter the regex pattern");
            Pattern pattern = Pattern.compile(sc.nextLine());
            System.out.println("Enter the text");
            Matcher matcher = pattern.matcher(sc.nextLine());

            boolean found = false;

            while (matcher.find()){
                System.out.println("I found the text " + matcher.group() + "starting at index " + matcher.start() + " and ending at index " + matcher.end());
                found = true;

            }

            if(!found) {
                System.out.println("No match found");
            }
        }
    }


    public static void main(String[] args) {
        Examples.example1();
        Examples.example2();
        System.out.println(Examples.alphaNumericCHeck("Sandip123"));
        System.out.println(Examples.TenDigitNumericCharacter("1234678911"));
        Examples.finderExample();
    }
}
