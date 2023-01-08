import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DeclaringMultilineStrings {
    private String multiLineStr = """
            Hello this is sandip Neupane
            """;

    private static String lineSeprator = System.lineSeparator();

    public static void multilineExample1(){
        String finalString = String.join(lineSeprator,"Sandip is generous", "humble", "and good looking");
        System.out.println(finalString);
    }

    public static void main(String[] args) {
        String finalString = "Sandip is decent" + lineSeprator +"Hard Working";

        //using string
        String finalStr = String.format("%s" + lineSeprator + "%s", "Sandip", "Neupane");

        System.out.println(finalStr);
        System.out.println(finalString);
        multilineExample1();

        String result = "hello".repeat(5);
        System.out.println(result);

        String result1 = String.join("", Collections.nCopies(5, "HELLO"));
        System.out.println(result1);

        String result2 = Stream.generate(() -> "HELLO").limit(5).collect(Collectors.joining());
        System.out.println(result2);

        String result3 = String.format("%0" + 5 + "d", 0)
                .replace("0", "hello");
        System.out.println(result3);

    }

    public static String concatRepeat(String str , int n){
        StringBuilder sb = new StringBuilder();
        for(int i =0; i < n ; i++){
            sb.append(str);
        }
        return sb.toString();
    }

    public static String longestPreFix(String[] strs){
        if(strs.length == 1){
            return strs[0];
        }
        for(int i=0; i< strs[0].length(); i++){
            char charAtI = strs[0].charAt(i);

            for(int j = 1; i< strs.length; i++){
                if(strs[j].charAt(i) == charAtI){

                }
            }

        }
        return "";
    }


}
