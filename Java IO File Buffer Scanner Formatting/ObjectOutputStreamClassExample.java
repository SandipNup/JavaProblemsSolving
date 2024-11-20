import java.io.*;

public class ObjectOutputStreamClassExample {
    public static void main(String[] args) {
        int data1 = 5;
        String data2 = "This is programiz Example";
        try {
            FileOutputStream fos = new FileOutputStream("D:\\Java\\JavaBookFollow\\Java IO File Buffer Scanner Formatting\\FileInputStreamExample.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeInt(data1);
            oos.writeObject(data2);
            oos.close();

            // Read Data from Object Input Stream
            FileInputStream fis = new FileInputStream("D:\\Java\\JavaBookFollow\\Java IO File Buffer Scanner Formatting\\FileInputStreamExample.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);

            System.out.println("Integer Data:" + ois.readInt());
            System.out.println("String Data: " + ois.readObject());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
