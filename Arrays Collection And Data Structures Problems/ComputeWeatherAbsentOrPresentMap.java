import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class ComputeWeatherAbsentOrPresentMap {
    private static final Map<String, String> databaseMap = new HashMap<>(Map.of(
            "mysql", "Sunny",
            "postgres", "Rainy",
            "oracle", "Cloudy"
    ));

    private static final Map<String, String> mapDB =  new HashMap<>();

    private static final Map<String, String> mergeTestMap =  new HashMap<>();

    static {
        databaseMap.put("pp", null);
        mapDB.put("postgresql", "127.0.0.1");
        mapDB.put("mysql", "192.168.0.50");
        mergeTestMap.put("postgresql", "10.1");
        mergeTestMap.put("mysql", "10.50");
    }

    private static void putIfAbsentTestExample(){
        System.out.println(mergeTestMap);
        String val = mergeTestMap.putIfAbsent("postgresql", "10.2");
        System.out.println(val);
        System.out.println(mergeTestMap);
        mergeTestMap.putIfAbsent("testDb", "testDB");
        System.out.println(mergeTestMap);

    }

    private static void mergeExampleIfNotPresentAddOrComputeNewWithOld(){
        System.out.println("Original: " + mergeTestMap);

        BiFunction<String,String, String> biFunction = (oldVal, newVal) ->{
            if (oldVal == null) {
                return newVal;
            }else {
                return oldVal + " " + newVal;
            }
        };

        mergeTestMap.merge("postgresql", "10.2", biFunction);
        mergeTestMap.merge("mysql", "10.51", biFunction);
        mergeTestMap.merge("oracle", "10.51", biFunction);
        System.out.println("After merge: " + mergeTestMap);

    }

    private static void computeAddressIfPresentOrAbsent() throws UnknownHostException {
        System.out.println("Orgainal: " + mapDB);
        String address = InetAddress.getLocalHost().getHostAddress();
        BiFunction<String, String, String> biFunction = (key, value) -> {
            if(value == null){
                return "jdbc:"+key+"://"+address+"/cutomer_db";
            }
            return "jdbc:"+key+"://"+ value+"/cutomer_db";
        };

        mapDB.compute("oracle", biFunction);
        System.out.println(mapDB);
        mapDB.compute("mysql", biFunction);
        System.out.println(mapDB);

    }
    public static void main(String[] args) {
        System.out.println(databaseMap);

        databaseMap.computeIfPresent("oracle", (key, value) -> value+300);
        System.out.println(databaseMap);

        databaseMap.computeIfAbsent("mongodb", (key) -> "snowy");
        System.out.println(databaseMap);

        databaseMap.computeIfAbsent("pp", (key) -> "funny");
        System.out.println(databaseMap);

        BiFunction<String, String, String> biFunctionIfPresent = (key,value) -> key+value;

        databaseMap.computeIfPresent("pp", biFunctionIfPresent);
        System.out.println(databaseMap);

        String val =  databaseMap.computeIfAbsent("pp", (key) -> "funnytetettest");
        System.out.println(val);
        try{
            computeAddressIfPresentOrAbsent();
        }catch(UnknownHostException e){
            e.printStackTrace();
        }

        mergeExampleIfNotPresentAddOrComputeNewWithOld();

        putIfAbsentTestExample();
    }
}
