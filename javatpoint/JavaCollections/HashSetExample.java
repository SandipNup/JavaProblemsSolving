package JavaCollections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSetExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("Sandip");
        list.add("Roshan");
        list.add("Ishowr");
        list.add("Sandesh");
        list.add("Sunil");

        System.out.println(list);

        // conveting list to a hashset
        HashSet<String> set = new HashSet<>(list); 

        System.out.println(set);
    }
}
