import java.io.*;

class Pet implements Serializable{
    private final String name;
    private final String ownerName;

    public Pet(String name, String ownerName){
        this.name = name;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }
}

public class ObjectOutputStreamExample2 {
    public static void main(String[] args) {
        Pet dog1 = new Pet("Doggy", "Sandip");

        try {
            FileOutputStream fos = new FileOutputStream("D:\\Java\\JavaBookFollow\\Java IO File Buffer Scanner Formatting\\ObjectOutputStreamExampleFile");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(dog1);

            FileInputStream fis = new FileInputStream("D:\\Java\\JavaBookFollow\\Java IO File Buffer Scanner Formatting\\ObjectOutputStreamExampleFile");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Pet newPet = (Pet) ois.readObject();

            System.out.println("Object read from ObjectInputStream" +newPet);

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
