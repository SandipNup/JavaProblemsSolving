import java.util.Arrays;

public class IncreasingSizeOfArray {

    public static class Melon {
        private String type;
        private int weight;

        public Melon(String type, int weight) {
            this.type = type;
            this.weight = weight;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        @Override
        public String toString(){
            return type+weight;
        }
    }

    public static int[] addElementBoxBy5(int[] arr){
        return Arrays.copyOf(arr, arr.length+5);
    }
    
    public static <T> T[] addElement(T[] arr, T obj){
        T[] resultArr = Arrays.copyOf(arr, arr.length+1);
        resultArr[resultArr.length-1] = obj;
        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        Arrays.setAll(arr, i -> {
            if(i==0) return 2;
            else return i*i;
        });

        int[] resizedArr = addElementBoxBy5(arr);
        System.out.println(Arrays.toString(resizedArr));

        Melon[] melons = {
                new Melon("cantalope", 150),
                new Melon("redmelon", 250),
                new Melon("greenmelon", 50),
                new Melon("whitemelon", 120),
                new Melon("yellowmelon", 10),
                new Melon("yellowmelon", 30),
                new Melon("zellowmelon", 20)
        };

        Melon[] arrMelons = addElement(melons, new Melon("terromelon", 10));
        System.out.println(Arrays.toString(arrMelons));
     }
}

