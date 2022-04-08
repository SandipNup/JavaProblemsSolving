import java.lang.CloneNotSupportedException;

public class ObjectCloning implements Cloneable{
    int rollno;
    String name;

    ObjectCloning(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String args[]){
        try {
        ObjectCloning obj1 = new ObjectCloning(8, "Sandip Neupane");
        ObjectCloning obj2 = (ObjectCloning)obj1.clone();
        System.out.println(obj1.rollno + " " + obj1.name);
        System.out.println(obj2.rollno + " " + obj2.name);
        } catch(CloneNotSupportedException c){
            System.out.println("Exception Not Handled");
        }
    }    
}
