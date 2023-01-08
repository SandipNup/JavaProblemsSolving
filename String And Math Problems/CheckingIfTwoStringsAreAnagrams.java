// 18. Checking whether two strings are anagrams: Write a program that checks
// whether two strings are anagrams. Consider that an anagram of a string is

import java.util.*;

public class CheckingIfTwoStringsAreAnagrams {

    private static int EXTENDED_ASCII_CODE = 256;
    public static boolean isAnagramSolution1(String str1, String str2){
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase(Locale.ROOT);

        Map<Character, Integer> str1Map = new HashMap<>();
        Map<Character, Integer> str2Map = new HashMap<>();

        if(str1.length() != str2.length()){
            return false;
        }

        for(int i=0; i < str1.length(); i++){
            // for string 1
            Character chStr1 = str1.charAt(i);
            Integer int1 = str1Map.containsKey(chStr1) ? str1Map.put( chStr1,str1Map.get(chStr1) + 1): str1Map.put(chStr1, 1);

            // for string 2
            Character chStr2 = str2.charAt(i);
            Integer int2 = str2Map.containsKey(chStr2) ? str2Map.put(chStr2, str2Map.get(chStr2) + 1) : str2Map.put(chStr2, 1);
        }

        List<Integer> list1 = new ArrayList<>(str1Map.values());
        List<Integer> list2 = new ArrayList<>(str2Map.values());

        Collections.sort(list1);
        Collections.sort(list2);


        return list1.equals(list2);
    }

    public static boolean isAnagramsSolution2(String str1, String str2){
        int[] counts = new int[EXTENDED_ASCII_CODE];
        char[] str1CharArr = str1.replaceAll("\\s","").toLowerCase().toCharArray();
        char[] str2CharArr = str2.replaceAll("\\s", "").toLowerCase().toCharArray();

        if(str1CharArr.length != str2CharArr.length)
            return false;


        for(int i=0; i< str1CharArr.length; i++){
            counts[str1CharArr[i]]++;
            counts[str2CharArr[i]]--;
        }

        for (int i=0; i< counts.length; i++){
            if(counts[i] != 0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramSolution1("apple", "pplae"));
        System.out.println(isAnagramsSolution2("apple", "pplae"));
        System.out.println(isAnagramsSolution2("papple", "pplae"));

    }
}
