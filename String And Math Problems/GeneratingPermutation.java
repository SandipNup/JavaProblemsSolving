// 10. Generating all permutations: Write a program that generates all of the
// permutations of a given string.
/**
 *           [A|B|C]
 *             /\   \
 *            /  \    \
 *     A fixed B Fixed  C Fixed 
 *      /           |           \
 *   [A|B|C]       [B|A|C]      [C|A|B]
 *      /\               |              \
 *     /  \             / \              / \
 * [A|B|C] [A|C|B] [B|A|C] [B|C|A]  [C|B|A] [C|A|B]
 */
public class GeneratingPermutation {
    public static void printPermutation(String prefix, String str){
        int length = str.length();
        if(length== 0){
            System.out.println(prefix + " ");
        }else {
            for(int i =0; i< length; i++){
                System.out.println(i);
                printPermutation(prefix + str.charAt(i), str.substring(i+ 1, length)+ str.substring(0, i) );
            }
        }
    }
    public static void main(String[] args) {
        GeneratingPermutation.printPermutation("", "ABC");
    }
}
