import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowelsAndConsonants {
    
    private static final Set<Character> allVowels = new HashSet(Arrays.asList('a', 'e', 'i', 'o', 'u'));

    public static void countVowelAndConsonants(String str) {
        str = str.toLowerCase();
        int vowelsCount = 0;
        int consonantsCounts = 0;
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(allVowels.contains(ch)) {
                vowelsCount++;
            }else if(ch > 'a' && ch <= 'z'){
                consonantsCounts++;
            }
        }
        System.out.println(vowelsCount);
        System.out.println(consonantsCounts);
    }
    public static void main(String[] args) {
        System.out.println("abc");
        CountVowelsAndConsonants.countVowelAndConsonants("aaaa444");
    }
}
