package SortingAlgorithms;

import java.util.Arrays;

public class FindingElementsInObject {
    public static class Melon {
        private final String name;
        private final int weight;

        public Melon(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()){
                return false;
            }
            Melon melon = (Melon) o;
            return weight == melon.weight && name.equals(melon.name);
        }

        @Override
        public int hashCode(){
            return name.hashCode() + weight;
        }

        @Override
        public String toString(){
            return name + " (" + weight + ")";
        }

        public int getWeight(){
            return weight;
        }

        public String getName(){
            return name;
        }
    }

    public static Melon[] createMelonsArray(){
        Melon[] melons = new Melon[10];
        for(int i = 0; i < melons.length; i++){
            melons[i] = new Melon("Melon" + i, i * 100);
        }
        return melons;
    }

    // using equals to determine if it contains certain elements
    public static <T> boolean containsElement(T[] arr, T obj){
        for (T t : arr) {
            if (t.equals(obj)) return true;
        }
        return false;
    }

    // relying on List.contains which uses equals
    public static <T> boolean containsElement1(T[] arr, T obj){
        return Arrays.asList(arr).contains(obj);
    }

    public static void main(String[] args){
        Melon[] melons = new Melon[10];
        melons = createMelonsArray();

        System.out.println(Arrays.toString(melons));

        System.out.println("ContainsElement " + containsElement(melons, new Melon("Melon2", 200)));
        System.out.println("ContainsElement1 " + containsElement1(melons, new Melon("Melon3", 200)));
        System.out.println("ContainsElement1 " + containsElement1(melons, new Melon("Melon3", 300)));


    }
}
