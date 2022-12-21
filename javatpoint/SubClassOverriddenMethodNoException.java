import java.io.IOException;

class Parent{
    void msg() throws IOException{
        System.out.println("Parent");
    }
}

public class SubClassOverriddenMethodNoException extends Parent{
    @Override
    void msg(){
        System.out.println("Child method");
    }

    public static void main(String[] args) {
        Parent m = new SubClassOverriddenMethodNoException();
        try{
            m.msg();
        }catch(Exception e){
            System.out.println("Exception Handled");
        }
    }
}
