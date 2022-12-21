package JavaCollections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> strings = new LinkedList<>();
        strings.add("Sandip");
        strings.add("Sagar");
        strings.add("Dipesh");
        strings.add("Roshan");

        Iterator<String> itr = strings.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    
    
}
