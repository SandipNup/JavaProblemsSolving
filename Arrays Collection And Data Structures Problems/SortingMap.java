import java.util.*;
import static java.util.stream.Collectors.toMap;


class ColorTest implements Comparable<ColorTest> {
    private String name;
    private String hexVal;

    public ColorTest(String name, String hexVal) {
        this.name = name;
        this.hexVal = hexVal;
    }

    public String getName() {
        return name;
    }

    public String getHexVal() {
        return hexVal;
    }

    @Override
    public String toString() {
        return name + " "+ hexVal;
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;

        if(!(obj instanceof ColorTest other)) return false;
        return this.name.equals(other.name) && this.hexVal.equals(other.hexVal);
    }

    @Override
    public int compareTo(ColorTest o){
        return this.name.compareTo(o.name);
    }
}

public class SortingMap {

    private static Map<Integer, String> map = new HashMap<>();

    private static Map<ColorTest, String> colorTestMap = new HashMap<>();

    static {
        map.put(5, "oracle");
        map.put(2, "mysql");
        map.put(3, "postgres");
        map.put(4, "mongodb");

        colorTestMap.put(new ColorTest("red", "5"), "oracle");
        colorTestMap.put(new ColorTest("green", "1"), "mysql");
        colorTestMap.put(new ColorTest("blue", "2"), "postgres");
        colorTestMap.put(new ColorTest("yellow", "3"), "mongodb");
        colorTestMap.put(new ColorTest("black", "6"), "derby");
    }

    public static <K,V> Map<K, V> sortingByKeyUsingStreamSorted(Map<K,V> map, Comparator<? super K> comparator){
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByKey(comparator))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,
                        (v1, v2) -> v1, LinkedHashMap::new));
    }

    public static <K,V> Map<K,V> sortingByValueUsingStreamSorted(Map<K,V> map, Comparator<? super V> comparator){
        return map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(comparator))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2)-> v1, LinkedHashMap::new));
    }

    public static void main(String[] args) {
        // sorting by natural order or key Integer,
        Map<Integer, String> sortedMap = new TreeMap<>(map);
        System.out.println(sortedMap);

        System.out.println("Original Color Map: " + colorTestMap);
        Map<ColorTest, String> sortedColorTestMap = new TreeMap<>(colorTestMap);
        System.out.println("Sorted Color Map: " + sortedColorTestMap);

        // if you want to have a shorted map with comparator
        Comparator<ColorTest> comparator = Comparator.comparing(ColorTest::getName);
        Map<ColorTest, String> sortedMap2 = new TreeMap<>(comparator);
        sortedMap2.putAll(colorTestMap);
        System.out.println("Sorted Color Map with Comparator: " + sortedMap2);

        Map<ColorTest, String> sortedByNameMap = sortingByKeyUsingStreamSorted(colorTestMap, comparator);
        System.out.println("sortedByNameMap "  + sortedByNameMap);

        Comparator<ColorTest> hexComparator = Comparator.comparing(ColorTest::getHexVal);
        Map<ColorTest, String> sortedByHexMap = sortingByKeyUsingStreamSorted(colorTestMap, hexComparator);
        System.out.println("sortedByHexMap "  + sortedByHexMap);

        Comparator<String> stringComparator = Comparator.naturalOrder();
        Map<ColorTest, String> sortedByValueMap = sortingByValueUsingStreamSorted(colorTestMap, stringComparator);
        System.out.println("sortedByValueMap " + sortedByValueMap);

    }
}
