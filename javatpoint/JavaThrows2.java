import java.io.IOException;

class M{
    void method() throws IOException{
        throw new IOException("Device error");
    }
}

public class JavaThrows2 {
    public static void main(String[] args) {
        try{
            
            M obj = new M();
            obj.method();
        }catch(Exception e){
            System.out.println("Exception Handled");
        }
        System.out.println("Normal flow");
    }
    
}
