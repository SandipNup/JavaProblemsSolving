package JavaCollections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        TreeSet<String> strSet = new TreeSet<String>();
        strSet.add("Sandip");
        strSet.add("Roshan");
        strSet.add("Dipesh");
        strSet.add("Sagar");

        Iterator itr = strSet.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
