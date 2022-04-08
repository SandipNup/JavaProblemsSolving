
public class JavaNestedTry {

    public static void nestedTry(){
        try{

            try{
                int a[] = new int[5];
                int b = a[10];
                System.out.println(b);

            }catch(ArithmeticException e){
                System.out.println(e);
            } finally{
                System.out.println("Exception is not handeled here but finally blcok is executed");
            }

        }catch(Exception e){
            System.out.println("Generic exception");
            System.out.println(e);
        }finally {
            System.out.println("Finally block is always execeuted");
        }
    }
    public static void main(String[] args) {
        // try{
        //     int a = 30;

        //     try{
        //         int b = a/0;
        //     } catch(ArithmeticException e){
        //         System.out.println("Arithmatic Exception is handled");
        //     }

        //     int c[] = new int[5];
        //     System.out.println(c[10]);
            
        // } catch(ArrayIndexOutOfBoundsException e) {
        //     System.out.println("Array index out of bound exception is handled");
        // }
        JavaNestedTry.nestedTry();
    }
}
