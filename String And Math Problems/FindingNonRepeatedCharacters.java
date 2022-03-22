// 2. Finding the first non-repeated character: Write a program that returns the
// first non-repeated character from a given string.

public class FindingNonRepeatedCharacters {

    // total ascii 
    private static final int EXTENDED_ASCII_CODES = 256;

    public static char firstNonRepeatedCharacter(String str) {
        int[] flags = new int[EXTENDED_ASCII_CODES];
        System.out.println(flags.length);
        for (int i = 0; i < flags.length; i++) {
            flags[i] = -1;
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (flags[ch] == -1) {
                flags[ch] = i;
            } else {
            flags[ch] = -2;
            }
        }
        int position = Integer.MAX_VALUE;
        for (int i = 0; i < EXTENDED_ASCII_CODES; i++) {
            if (flags[i] >= 0) {
            position = Math.min(position, flags[i]);
            }
        }
        return position == Integer.MAX_VALUE ?
        Character.MIN_VALUE : str.charAt(position);
}

public static void main(String[] args) {
    System.out.println(FindingNonRepeatedCharacters.firstNonRepeatedCharacter("Sandip NeupanES"));
}

}
