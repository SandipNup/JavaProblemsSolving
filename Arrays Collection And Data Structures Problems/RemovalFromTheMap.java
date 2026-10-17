import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class RemovalFromTheMap {
    private static Map<Integer, String> map = new HashMap<>();
    private static Map<Integer, String> iterMap = new HashMap<>();

    static {
        map.put(1, "oracle");
        map.put(2, "mysql");
        map.put(3, "postgres");
        map.put(4, "mongodb");

        iterMap.put(1, "oracle");
        iterMap.put(2, "mysql");
        iterMap.put(3, "postgres");
        iterMap.put(4, "mongodb");
    }

    private static Map<Integer, String> removingUsingIteratorExample(){
        System.out.println("Original map Iterator: " + iterMap);
        Iterator<Map.Entry<Integer, String>> mapIterator = iterMap.entrySet().iterator();

        while(mapIterator.hasNext()){
            if(mapIterator.next().getKey()== 2){
                mapIterator.remove();
            }
        }

        return iterMap;

    }

    private static void usingRemoveIfEntrySetExample(){
        System.out.println("Entry set remove if map: " + iterMap);
        iterMap.entrySet().removeIf(e-> e.getKey() == 3);
        System.out.println("After removing key 3 using removeIf: " + iterMap);
    }

    public static void main(String[] args) {
        System.out.println("Original map: " + map);

        // removing entry by key
        map.remove(2); // removes mysql returns mysql

        System.out.println("After removing mysql: " + map);

        map.remove(5); // returns null as key 5 is not present in map
        System.out.println("After removing key 5: " + map);

        // removing entry by key and value
        map.remove(3, "postgres"); // return postgres // removes entry if there pefrenct match of key and value in map

        System.out.println("After removing postgres: " + map);

        System.out.println(removingUsingIteratorExample());
        usingRemoveIfEntrySetExample();
    }
}
