import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

class Color {
    private String name;
    private String hexVal;

    public Color(String name, String hexVal) {
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

        if(!(obj instanceof Color other)) return false;
        return this.name.equals(other.name) && this.hexVal.equals(other.hexVal);
    }
}

public class ReplacingEntriesFromAMap {
    private static Map<Integer, String> map = new HashMap<>();
    private static Map<Integer, String> iterMap = new HashMap<>();

    private static Map<Integer, Color> colorMap = new HashMap<>();

    static {
        map.put(1, "oracle");
        map.put(2, "mysql");
        map.put(3, "postgres");
        map.put(4, "mongodb");

        iterMap.put(1, "oracle");
        iterMap.put(2, "mysql");
        iterMap.put(3, "postgres");
        iterMap.put(4, "mongo");

        colorMap.put(1, new Color("red", "#FF0000"));
        colorMap.put(2, new Color("green", "#00FF00"));
        colorMap.put(3, new Color("blue", "#0000FF"));
        colorMap.put(4, new Color("yellow", "#FFFF00"));
        colorMap.put(5, new Color("black", "#000000"));
    }

    public static void usingReplaceAllExample(){
        System.out.println("Original map: " + iterMap);
        BiFunction<Integer, String, String> biFunction = (key, value) -> value + "DB";

        iterMap.replaceAll(biFunction);
        System.out.println("Iter Map" + iterMap);
    }

    public static void usingReplaceExamplesInMapOfObject(){
        System.out.println("Original map: " + colorMap);

        colorMap.replace(1, new Color("white", "#FFFFFF"));
        System.out.println("After replacing key 1 with new color: " + colorMap);

        colorMap.replace(2, new Color("green", "#00FF00"), new Color("lime", "#32CD32"));
        System.out.println("After replacing key 2 with new color: " + colorMap);

        BiFunction<Integer, Color, Color> biFunction = (key, value) -> new Color(value.getName().toUpperCase(), value.getHexVal());
        colorMap.replaceAll(biFunction);
        System.out.println("After replacing all colors with uppercase names: " + colorMap);
    }

    public static void main(String[] args) {
        System.out.println("Orginal Map: " + map);

        String val = map.replace(2, "mssqlDB"); // repace key 2 with new value
        System.out.println(map);

        map.replace(3, "postgres", "postgresdb"); // replace the exact match of key and value with new value
        System.out.println(map);

        usingReplaceAllExample();
        usingReplaceExamplesInMapOfObject();
    }
}
