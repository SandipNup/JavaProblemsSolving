
public class JavaExceptionMultipleCatchBlock {
    public static void main(String[] args) {
        try {
            int a[] = new int[5];
            // String s = null;
            // System.out.println(s.length());
            a[5] = 30/0;
            System.out.println(a[10]);
        } catch (ArithmeticException e){
            System.out.println(e);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
