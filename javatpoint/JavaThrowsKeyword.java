import java.io.IOException;

public class JavaThrowsKeyword {

    // java throws keyword makes checked exception to be propagated
    // It provided information to the caller of the method about exception.

    void m() throws IOException{
        throw new IOException("Device error"); // Here IOEexception is checked exceptions
    }

    void n() throws IOException{
        m();
    }

    void p(){
        try{
            n();
        } catch (IOException e){
            System.out.println("IO exception is handled here which is propagated using throws keyword");
        }
    }

    public static void main(String[] args) {
        JavaThrowsKeyword obj = new JavaThrowsKeyword();
        obj.p();
        System.out.println("Normal flow");
    }
    
}
