public class CheckingStringContainsSubString {

    public boolean CheckingStringContainsSubString(String str, String subString){
        return str.contains(subString);
    }

    public boolean CheckingStringContainsSubString1(String str, String subString){
        return str.indexOf(subString) != -1;
    }
}
