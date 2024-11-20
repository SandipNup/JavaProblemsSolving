import java.io.*;

public class FileOutputStreamExample {
    public static void main(String[] args) {
        String textToWriteInFile = "\n This is the text to write in the file to write in the file write this text";
        try {
//            OutputStream outputStream = new FileOutputStream("D:\\Java\\JavaBookFollow\\Java IO File Buffer Scanner Formatting\\FileOutputStreamExample.txt");
//            OutputStream outputStream = new FileOutputStream("D:\\Java\\JavaBookFollow\\Java IO File Buffer Scanner Formatting\\FileOutputStreamExample.txt", true);

            File file = new File("D:\\Java\\JavaBookFollow\\Java IO File Buffer Scanner Formatting\\FileOutputStreamExample.txt");
            OutputStream outputStream = new FileOutputStream(file, true);

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
