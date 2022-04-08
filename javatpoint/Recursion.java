public class Recursion {

    static Integer factorial(Integer i){
       if (i == 1){
           return 1;
       }else {
           return i * factorial(i-1);
       }

    }

    static Integer n0 =0 , n1=1, n2 = 0;
    static StringBuilder fiboBuilder = new StringBuilder();

    static Integer fibonacci(Integer count){
        // 0 1 1 2 3 5 8

        if (count == 0) {
            return 1;
        }else{
            n2 = n0 + n1 ;
            n0 = n1;
            n1 = n2;
            System.out.print(" " + n2);
            

            return fibonacci(count-1);
        }        
    }

    public static void main(String[] args) {
        // System.out.println(Recursion.factorial(10));
        System.out.print("0" + " " + "1");
        fibonacci(10);
    }
    
}
