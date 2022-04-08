// 12. Removing duplicate characters: Write a program that removes the
// duplicate characters from the given string.

public class RemoveDuplicateCharacter {

    public static String removeDuplicate(String str){
        StringBuilder uniqueString = new StringBuilder();

        for(int i =0; i < str.length()-1; i++){
            char charAtI = str.charAt(i);
            String replacedStr = str.replace(String.valueOf(charAtI), "");
            if(replacedStr.length() == str.length()-1){
                uniqueString.append(charAtI);
            }
            else{
                uniqueString.append(charAtI);
                // str = str.split(String.valueOf(charAtI))
            }
            // else{
            //     // uniqueString.append(charAtI);
            //     strLength = replacedStr.length();
            // }

        }
        
        return uniqueString.toString();
    }

    public static String removeDuplicate1(String str) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i< str.length(); i++){
            char charAtI = str.charAt(i);
            if (sb.indexOf(String.valueOf(charAtI)) == -1){
                sb.append(charAtI);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(RemoveDuplicateCharacter.removeDuplicate("Ssanndippn"));
        System.out.println(RemoveDuplicateCharacter.removeDuplicate1("Ssanndippn"));
        System.out.println(RemoveDuplicateCharacter.removeDuplicate("SandipNNNsasaUUppP"));
        System.out.println(RemoveDuplicateCharacter.removeDuplicate1("SandipNNNsasaUUppP"));
    }
    
}
