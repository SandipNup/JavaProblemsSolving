import java.io.IOException;

public class ExceptionPropagationExample2 {
    void m(){
        try{

            // Checked Exception is not propagated
            // checked exception are IOException, SQLExceptions, ClassNotFoundException
        throw new IOException("Device Error");
        }
        catch(Exception e){
            System.out.println("");
        }
    }

    void n(){
        m();
    }

    void p(){
        n();
        // try{
        //     n();
        // } catch(IOException e){
        //     System.out.println("exception handled");
        // }
    }

    public static void main(String[] args) {
        ExceptionPropagationExample2 obj = new ExceptionPropagationExample2();
        obj.p();
        System.out.println("Normal flow");
    }
}
