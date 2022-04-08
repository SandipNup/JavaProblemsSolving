// 8. Removing white spaces from a string: Write a program that removes all
// white spaces from the given string.


public class RemoveWhiteSpaceFromString {

    public static String removeWhiteSpace(String str){
        String spaceRemovedStr = str.replaceAll("\\s", "");
        return spaceRemovedStr;
    }

    public static void main(String[] args) {
        System.out.println(RemoveWhiteSpaceFromString.removeWhiteSpace("Sand i p N   E U   P"));
    }
    
}
