import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

public class FileInputStreamExample2 {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("D:\\Java\\JavaBookFollow\\Java IO File Buffer Scanner Formatting\\FileInputStreamExample.txt");
            byte[] data = new byte[100];
            System.out.println("Data in the file");
            inputStream.read(data);
            String contents = new String(data);
            System.out.println(contents);

            // reading each byte
            System.out.println("reading each bytes");
            inputStream.getChannel().position(0);
            int i = inputStream.read();
            while(i != -1){
                System.out.print((char)i);

                i = inputStream.read();
            }

            System.out.println();

            inputStream.getChannel().position(0);
            // Using available method to get availbale number of bytes
            System.out.println("Available bytes at the begaining  " + inputStream.available());
            inputStream.read();
            inputStream.read();
            System.out.println("Available bytes at the begaining  " + inputStream.available());

            inputStream.getChannel().position(0);
            inputStream.skip(10);

            int j = inputStream.read();
            while(j !=-1){
                System.out.print((char)j);
                j = inputStream.read();
            }


            inputStream.close();



        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
