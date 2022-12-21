import java.util.stream.Collectors;

public class RemoveAGivenCharacter {

    public static String removeACharacterSolution1(String str, char ch){
        return str.replaceAll(Character.toString(ch), "");
    }

    public static String removeACharacterSolution2(String str, char ch) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] charArray = str.toCharArray();

        for (char c : charArray){
            if (c != ch){
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }

    public static String removeCharacterSolution3Java8(String str, char ch) {
        return str.chars().filter(c -> c != ch).mapToObj(c -> String.valueOf((char) c)).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        System.out.println(RemoveAGivenCharacter.removeACharacterSolution1("Sandip Neupane", 'e'));
        System.out.println(RemoveAGivenCharacter.removeACharacterSolution2("Sandip Neupane", 'e'));
        System.out.println(RemoveAGivenCharacter.removeCharacterSolution3Java8("Sandip Neupane", 'e'));
    }
}
