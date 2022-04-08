import java.util.StringJoiner;

// 9. Joining multiple strings with a delimiter: Write a program that joins the
// given strings by the given delimiter.

public class JoinMultipleStringWithDelimeter {

    // using StringBuilder class
    public static String joinByDelimeter1(String delimeter, String...args){
        StringBuilder str = new StringBuilder();
        for (String arg: args){
            str.append(arg).append(delimeter);
        }
        return str.toString();
    }

    // using StringJoiner class
    public static String joinByDelimeter2(String delimeter, String...args){
        StringJoiner joiner = new StringJoiner(delimeter);
        for(String arg:args){
            joiner.add(arg);
        }
        return joiner.toString();
    }

    public static String joinByDelimeter3(String delimeter, String...args){
        String str = new String();
        return str.join(delimeter, args);
    }


    public static void main(String[] args) {
        System.out.println(JoinMultipleStringWithDelimeter.joinByDelimeter1("2445", "Sandip", "Neupane", "is", "pro"));
        System.out.println(JoinMultipleStringWithDelimeter.joinByDelimeter2("-", "Sandip", "From", "Chitwan"));
        System.out.println(JoinMultipleStringWithDelimeter.joinByDelimeter3("*", "Sandip", "From", "Chitwan"));
    }
}
