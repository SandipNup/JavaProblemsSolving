import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamToWriteData {

    public static void main(String[] args) {
        String str = "This input string going to be in Byte Array Output Stream";

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] bytes = str.getBytes();

        try{
            baos.write(bytes);
            baos.close();
            System.out.println(baos);


        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
