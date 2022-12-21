public class CheckStringContainsSubString {
    public static boolean containsSubString(String str, String subString){
        return str.contains(subString);
    }

    public static boolean checkContainsSubString(String str, String subString){
        return str.indexOf(subString) != -1;
    }

    public static void main(String[] args) {
        System.out.println(containsSubString("Sandip Neupane", "Neupa"));
        System.out.println(checkContainsSubString("Sandip Neupane", "Neupa"));
        System.out.println(containsSubString("Sandip Neupane", "upne"));
        System.out.println(checkContainsSubString("Sandip Neupane", "upne"));
    }
}
