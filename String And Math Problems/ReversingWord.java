// 3. Reversing letters and words: Write a program that reverses the letters of
// each word and a program that reverses the letters of each word and the
// words themselves.

public class ReversingWord {
    private static final String WHITESPACE = " ";

    public static String reverseWords(String str) {
       String reversedString = "";
       String[] splittedString = str.split(" ");
       for (String i: splittedString){
           int j = i.length() - 1;
           String reversedWord = "";
           while(j >= 0) {
            String charAt = String.valueOf(i.charAt(j));
            reversedWord += charAt;
            j--;
           }
           reversedString += reversedWord + " ";
       }
       return reversedString;
    }

    public static String reverseWordBookSolution(String str){
        String[] words = str.split(WHITESPACE);

        StringBuilder reversedString = new StringBuilder("");

        for (String word: words){
            StringBuilder reversedWord = new StringBuilder("");

            for (int i = word.length() - 1 ; i>= 0; i--){
                reversedWord.append(word.charAt(i));
            }
            reversedString.append(reversedWord).append(WHITESPACE);
        }
        return reversedString.toString();
        
    }

    public static void main(String[] args) {
        System.out.println(ReversingWord.reverseWords("Sandip Neupane"));
        System.out.println(ReversingWord.reverseWordBookSolution("Sandip Neupane Clark"));
    }
}
