import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String textToWriteInFile = "This is the text to write in the file to write in the file write this text";
        try {
            OutputStream outputStream = new FileOutputStream("D:\\Java\\JavaBookFollow\\Java IO File Buffer Scanner Formatting\\FileOutputStreamExample.txt");
            outputStream.write(textToWriteInFile.getBytes());
            System.out.println("Data has been written to the file");
            outputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
