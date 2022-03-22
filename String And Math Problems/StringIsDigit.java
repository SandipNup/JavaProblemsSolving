// 4. Checking whether a string contains only digits: Write a program that
// checks whether the given string contains only digits.

public class StringIsDigit {

    private static Boolean isDigit(String str){
        for(int i = 0; i<=str.length() - 1; i++) {
            if (!Character.isDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(StringIsDigit.isDigit("5580"));
        System.out.println(StringIsDigit.isDigit("5580S"));
        System.out.println(StringIsDigit.isDigit("5580S000"));
        System.out.println(StringIsDigit.isDigit("00111"));
    }
}
