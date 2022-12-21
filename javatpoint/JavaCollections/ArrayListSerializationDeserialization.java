package JavaCollections;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListSerializationDeserialization {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();

        students.add("Sandip");
        students.add("Neuapne");
        students.add("Is Good");

        try {

            // serialization
            FileOutputStream fos = new FileOutputStream("D:/Java/JavaBookFollow/javatpoint/JavaCollections/test.txt");

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            fos.close();
            oos.close();

            // Deserialization
            FileInputStream fis = new FileInputStream("D:/Java/JavaBookFollow/javatpoint/JavaCollections/test.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList liste =(ArrayList) ois.readObject();
            System.out.println(liste);

        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}