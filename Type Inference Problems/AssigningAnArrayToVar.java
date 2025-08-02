public class AssigningAnArrayToVar {

    public static void main(String[] args) {
        int[] numbers = new int[10];

        // using var keyword to achieve same thing
        var numbers1 = new int[10];

        int[] numbers3 = {1,2,3};

        // var will not work with bracket syntax
//        var numbers4 = {1,2,3};

        String pending = "Pending", processed = "Processed", deleted = "Deleted";

        // you cannot using var to define multiple varibles like in preceding example
//        var pending1 = "Pending" , processed = "Processed"; does not compile

        // use one line per declaration using var keyword

        var pending2 = "Pending";
        var processed2 = "Processed";


    }
}
