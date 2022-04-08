// 6. Counting occurrences of a certain character: Write a program that counts
// the occurrences of a certain character in a given string.

public class CountOccuranceOfCharacter {

    public static int solution1(String str, char ch){
        return (str.length()- str.replace(String.valueOf(ch), "").length());
    }

    public static int solution2(String str, char ch){
        Integer count = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(CountOccuranceOfCharacter.solution1("Sandip Neupane", 'e'));
        System.out.println(CountOccuranceOfCharacter.solution2("Sandip Neupaneeeee", 'e'));
    }
    
}
