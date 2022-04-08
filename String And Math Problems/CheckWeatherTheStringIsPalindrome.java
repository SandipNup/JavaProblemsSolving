// 11. Checking whether a string is a palindrome: Write a program that
// determines whether the given string is a palindrome or not.

// Palindrome Examples
// ABA , MADAM , BACAB, aibohphobia

public class CheckWeatherTheStringIsPalindrome {
    public static boolean checkPalidrome(String str){
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        while(right > left){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            right--;
            left++;
        }

        return true;
    }

    public static boolean checkPalidrome2(String str) {
        str = str.toLowerCase();
        int strLength = str.length();
        for(int i=0; i < str.length(); i++){
            if(str.charAt(i) != str.charAt(strLength-i-1)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkPalidrome3(String str){
        String reversedString = new StringBuilder(str).reverse().toString();
        // System.out.println(reversedString);

        if(str.equals(reversedString)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(CheckWeatherTheStringIsPalindrome.checkPalidrome("aibohphobia"));
        System.out.println(CheckWeatherTheStringIsPalindrome.checkPalidrome2("MADAM"));
        System.out.println(CheckWeatherTheStringIsPalindrome.checkPalidrome3("BACAB"));
        System.out.println(CheckWeatherTheStringIsPalindrome.checkPalidrome3("DADDY"));

    }
}
