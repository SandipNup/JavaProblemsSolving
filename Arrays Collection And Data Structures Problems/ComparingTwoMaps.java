import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class ColorCode {
    private String name;
    private String hexVal;

    public ColorCode(String name, String hexVal) {
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

        if(!(obj instanceof ColorCode other)) return false;
        return this.name.equals(other.name) && this.hexVal.equals(other.hexVal);
    }
}

public class ComparingTwoMaps {
    private static Map<Integer, ColorCode> colorMap1 = new HashMap<>();
    private static Map<Integer, ColorCode> colorMap2 = new HashMap<>();

    public static Map<Integer, ColorCode[]> colorMap3 = new HashMap<>();
    public static Map<Integer, ColorCode[]> colorMap4 = new HashMap<>();

    static {
        colorMap1.put(1, new ColorCode("red", "#FF0000"));
        colorMap1.put(2, new ColorCode("green", "#00FF00"));
        colorMap1.put(3, new ColorCode("blue", "#0000FF"));
        colorMap1.put(4, new ColorCode("yellow", "#FFFF00"));
        colorMap1.put(5, new ColorCode("black", "#000000"));

        colorMap2.put(1, new ColorCode("red", "#FF0000"));
        colorMap2.put(2, new ColorCode("green", "#00FF00"));
        colorMap2.put(3, new ColorCode("blue", "#0000FF"));
        colorMap2.put(4, new ColorCode("yellow", "#FFFF00"));
        colorMap2.put(5, new ColorCode("black", "#000000"));

        ColorCode[] colorCodes1 = {
                new ColorCode("red", "#FF0000"),
                new ColorCode("green", "#00FF00"),
                new ColorCode("blue", "#0000FF"),
                new ColorCode("yellow", "#FFFF00"),
                new ColorCode("black", "#000000")
        };
        ColorCode[] colorCodes2 = {
                new ColorCode("red", "#FF0000"),
                new ColorCode("green", "#00FF00"),
                new ColorCode("blue", "#0000FF"),
                new ColorCode("yellow", "#FFFF00"),
                new ColorCode("black", "#000000")
        };

        colorMap3.put(1, colorCodes1);
        colorMap4.put(1, colorCodes2);
    }

    public static <K, V> boolean checkEqualWithArraysMap(Map<K,V[]> map1, Map<K, V[]> map2){
        if(map1.size() != map2.size()) return false;
        for(K key: map1.keySet()){
            if(!Arrays.equals(map1.get(key), map2.get(key))){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Are the two maps equal? " + colorMap1.equals(colorMap2));
        System.out.println("Are the two maps with arrays equal? " + colorMap3.equals(colorMap4));

        System.out.println("Are the two maps with arrays equal using custom method? " + checkEqualWithArraysMap(colorMap3, colorMap4));
    }



}
