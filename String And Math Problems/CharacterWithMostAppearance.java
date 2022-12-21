import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CharacterWithMostAppearance {
    private static final int EXTENDED_ASCII_CODES = 256;

    public static Character characterWithMostAppearance(String str){
        HashMap<Character, Integer> newMap = new HashMap<Character, Integer>();
        char[] charArr = str.toCharArray();
        for(char ch: charArr) {
            if(!Character.isWhitespace(ch)) {
                newMap.put(ch, newMap.containsKey(ch) ? (newMap.get(ch) + 1) : 1);
//                if (!newMap.containsKey(ch)) {
//                    newMap.put(ch, 1);
//                } else {
//                    newMap.put(ch, newMap.get(ch) + 1);
//                }
            }
        }
        System.out.println(newMap.values());
        int maxOccurrence = Collections.max(newMap.values());

        Character charWithMaxOccurrence = 'c';

        for (Map.Entry<Character, Integer> entry: newMap.entrySet()){
            if (entry.getValue() == maxOccurrence){
                charWithMaxOccurrence = entry.getKey();
            }
        }

        System.out.println(newMap);

        return charWithMaxOccurrence;
    }

    public static Character characterWithMostAppearance1(String str){

        int maxOccurrence = -1;
        char maxCharacter = Character.MIN_VALUE;
        char[] chStr = str.toCharArray();

        int[] asciiCodes = new int[EXTENDED_ASCII_CODES];
        for (int i=0; i < chStr.length; i++){
            char currentCh = chStr[i];
            if(!Character.isWhitespace(currentCh)){
                int code = (int) currentCh;
                asciiCodes[code]++;
                if(asciiCodes[code] > maxOccurrence){
                    maxOccurrence = asciiCodes[code];
                    maxCharacter = currentCh;
                }
            }
        }
        return maxCharacter;
    }

    public static void main(String[] args) {
        System.out.println(characterWithMostAppearance("Neupppaneeep"));
        System.out.println(characterWithMostAppearance1("Neupppaneeep"));
    }
}
