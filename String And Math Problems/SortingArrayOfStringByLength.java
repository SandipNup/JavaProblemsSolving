import javax.naming.ldap.SortKey;
import java.util.Arrays;

// 15. Sorting an array of strings by length: Write a program that sorts by the
// length of the given array of strings.
public class SortingArrayOfStringByLength {
    public static String[] sortArrayByLength(String[] strs){
        Arrays.sort(strs, (a, b) -> Integer.compare(a.length(), b.length()));
        return strs;
    }

    public static void main(String[] args) {
        String[] strArr = {"Sandip", "Neupane", "apple", "Dog"};
        System.out.println(Arrays.toString(sortArrayByLength(strArr)));
    }
}
