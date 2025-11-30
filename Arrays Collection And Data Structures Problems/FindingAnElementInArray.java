import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class FindingAnElementInArray {

    private  static class Melon {
        private final String name;
        private final int weight;

        public Melon(String name, int weight) {
            this.name = name;
            this.weight = weight;
        }

        public String getName() {
            return name;
        }

        public int getWeight() {
            return weight;
        }

        @Override
        public String toString() {
            return "name:" + name + " weight: " + weight;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof Melon other)) return false;
            return this.weight == other.getWeight() && this.name.equals(((Melon) obj).getName());
        }

        @Override
        public int hashCode(){
            return 7 * this.weight + this.name.chars().sum();
        }
    }

    public static boolean containsElement(int[] arr, int target){
        for(int el: arr){
            if(el == target){
                return true;
            }
        }
        return false;
    }

    public static boolean containsElement1(int[] arr, int target){
        Arrays.sort(arr);
        int searchIndex = Arrays.binarySearch(arr, target);
        return searchIndex >= 0;
    }

    public static boolean containsElementFunctionalStyle(int[] arr, int target){
        return Arrays.stream(arr).anyMatch(i-> i== target);
    }

    private static boolean containsMelonsInArray(Melon[] melons, Melon melonToContain){
        for (Melon melon : melons) {
            if (melon.equals(melonToContain)) {
                return true;
            }
        }
        return  false;
    }

    private static boolean containsElementInArrayByConvertingToList(Melon[] melons, Melon melon){
        List<Melon> melonsList = List.of(melon);
        return melonsList.contains(melon);
    }
    // using Comparator for flexible way to check if the melon exist if weight contains or name contains

    public static <T> boolean containsElementMelon(T[] arr, T obj, Comparator<? super T> comparator){
        for(T element : arr){
            if(comparator.compare(obj,element) == 0){
                return true;
            }
        }
        return false;
    }

    public static <T> boolean containsElementBinarySearch(T[] arr, T objToContain , Comparator<? super T> comparator){
        Arrays.sort(arr, comparator);
        int index = Arrays.binarySearch(arr,objToContain,comparator);
        return index >= 0;
    }



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8 };
        boolean bool1 = containsElement1(arr, 6);
        System.out.println("Contains Element" + " " + bool1);
        boolean bool2 = containsElement(arr, 10);
        System.out.println("Contains Element2" + " " + bool2);
        boolean bool3 = containsElementFunctionalStyle(arr, 3);
        System.out.println("Contains Element functional style" + " " + bool3);


        // Finding Melons Object in Array
        Melon melon1 = new Melon("Example1" , 268);
        Melon melon2= new Melon("Example2" , 279);
        Melon melon3= new Melon("Example3" , 329);
        Melon melon4= new Melon("Example4" , 388);
        Melon melon5= new Melon("Example5" , 498);

        Melon[] melons = {melon1, melon5, melon3, melon2, melon4};

        Melon melonToFind = new Melon("Example3", 329);
        boolean containsMelon = FindingAnElementInArray.containsMelonsInArray(melons, melonToFind);

        System.out.println("Checked for existence of Melon" + melonToFind.name +
                (containsMelon ? " Melon Found and Juciy": " Melon Not Found sorry"));


        Melon melonToFind1 = new Melon("Example3", 329);
        boolean containsMelon1 = FindingAnElementInArray.containsElementInArrayByConvertingToList(melons, melonToFind);

        System.out.println("Checked for existence of Melon" + melonToFind.name +
                (containsMelon ? " Melon Found and Juciy": " Melon Not Found sorry"));


        Melon melonToFind2 = new Melon("Example3", 329);
        Comparator<Melon> comparator = Comparator.comparing(Melon::getName).thenComparing(Melon::getWeight);
        boolean containsMelon2 = FindingAnElementInArray.containsElementMelon(melons, melonToFind2, comparator);

        System.out.println("Checked for existence of Melon" + melonToFind.name +
                (containsMelon2 ? " Melon Found and Juciy": " Melon Not Found sorry"));

        Melon melonToFind3 = new Melon("Example3", 329);
        Comparator<Melon> comparator1 = Comparator.comparing(Melon::getName).thenComparing(Melon::getWeight);
        boolean containsMelon23= FindingAnElementInArray.containsElementBinarySearch(melons, melonToFind3, comparator1);

        System.out.println("Checked for existence of Melon" + melonToFind.name +
                (containsMelon23 ? " Melon Found and Juciy": " Melon Not Found sorry"));
    }
}
