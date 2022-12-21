//Counting the number of occurrences of a string in another string is a problem that can
//        have at least two interpretations:
//        11 in 111 occurs 1 time
//        11 in 111 occurs 2 times

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountingSubStringOccurrence {

    public static int countStringInString(String string, String toFind) {
        int position = 0;
        int count = 0;
        int size = toFind.length();

        while ((position = string.indexOf(toFind, position)) != -1) {
            position += size;
            count++;
        }

        return count;
    }

    public static int countTheOccurrenceSplitting(String string, String toFind){
        String[] result = string.split(Pattern.quote(toFind));
        System.out.println(result.toString());
        return result.length -1;
     }

     public static int countStringInStringUsingPatterAndMatcher(String string, String toFind){
        Pattern pattern = Pattern.compile(Pattern.quote(toFind));
         Matcher matcher = pattern.matcher(string);

         int position = 0;
         int count = 0;

         while(matcher.find(position)){
             position = matcher.start() + 1;
             count++;
         }

        return 1;
     }

    public static void main(String[] args) {
        System.out.println(countTheOccurrenceSplitting("1111111", "111"));
        System.out.println(countStringInStringUsingPatterAndMatcher("1111111", "111"));
    }
}
