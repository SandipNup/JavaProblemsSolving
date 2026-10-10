import java.util.Arrays;

public class ComparingTwoArrayLexicographically {

    private static class Melon implements Comparable {
        private final int weight;
        private final String name;

        public Melon(int weight, String name){
            this.weight = weight;
            this.name = name;
        }

        public int getWeight() {
            return weight;
        }

        public String getName() {
            return name;
        }

        public  boolean equals(Object obj){
            if(this==obj) return true;
            if(!(obj instanceof Melon other)) return false;
            return this.weight == other.getWeight() && this.name.equalsIgnoreCase(other.getName());
        }

        public int hashCode(){
            return 7 * 77 * this.name.hashCode();
        }

        @Override
        public int compareTo(Object object) {
            Melon otherMelon = (Melon) object;
            int nameCompare = this.name.compareTo(otherMelon.getName());
            if(nameCompare != 0) return  nameCompare;
            return Integer.compare(this.weight, otherMelon.weight);
        }
    }

    // lexicographically means dictionary like order

    public static void main(String[] args) {
        int[] arr1 = {8,2,5,1,7,4};
        int[] arr2 = {8,2,5,1,7,2};
        int[] arr3 = {2,9,1,5,6};
        int[] arr4 = {2,9,1,5,6};
        int[] arr5 = {8,2,5,1,7,3};
        int[] arr6 = {8,2,5,1,8,3};

        // Arrays class comes with compare method which check the lexicographical order of primitive data type
        // for of object type you would have to pass the

        int result1 = Arrays.compare(arr3, arr4); // returns zero arrays are equal
        int result2 = Arrays.compare(arr1, arr5);  // returns 1 since arr1  is lexiographically greater than arr5
        int result3 = Arrays.compare(arr2,arr5);  // return -1 as arr5 is lexiographically greater than arr2

        System.out.println("When two arrays are equal compare result is " + result1);
        System.out.println("when first array is greater than the second one result is " + result2);
        System.out.println("When first array is less than the second one the result is " + result3);


        // You can also use range like in equal or mismatched method to check lexicography
        int result4 = Arrays.compare(arr5,0, 6,arr6,0,6);
        System.out.println("arr5 range is less than arr6 so it should return -1 + result :" + result4);


        Melon melon1 = new Melon(5,"sandip");
        Melon melon2 = new Melon(1,"sagar");
        Melon melon3 = new Melon(3,"enish");
        Melon melon4 = new Melon(2,"ccir");
        Melon melon5 = new Melon(4,"ishowr");
        Melon[] melons = {melon1,melon2,melon3,melon4,melon5};
        Melon[] melons1 = {melon1,melon2,melon3,melon4,melon5};

        int result = Arrays.compare(melons,melons1) ;
        System.out.println(result);

    }
}
