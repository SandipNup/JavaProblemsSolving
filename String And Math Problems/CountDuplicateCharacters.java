// 1. Counting duplicate characters: Write a program that counts duplicate
// characters from a given string.
import java.util.*;

public class CountDuplicateCharacters {

    public static Map<Character, Integer> countDuplicateCharacters(String str) {
        Map <Character, Integer> result = new HashMap<> ();

        for (int i = 0; i< str.length(); i++){
            char ch = str.charAt(i);
            result.compute(ch, (k,v) -> (v== null) ? 1 : ++v);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(CountDuplicateCharacters.countDuplicateCharacters("%%%@@###"));
           
    }

}