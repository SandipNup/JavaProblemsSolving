import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        byte[] array = new byte[100];
        try {
            InputStream inputStream = new FileInputStream("D:\\Java\\JavaBookFollow\\Java IO File Buffer Scanner Formatting\\FileInputStreamExample.txt");
            System.out.println("Available bytes in the file :" + inputStream.available());
            inputStream.read(array);
            System.out.println("Data read from the file");

            // converting byte array into string
            String data = new String(array);
            System.out.println(data);
            inputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
