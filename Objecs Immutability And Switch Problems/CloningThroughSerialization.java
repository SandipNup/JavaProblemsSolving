import java.io.*;

class Radius1 implements Serializable {

    private int start;
    private int end;

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

}

final class Point3 implements Serializable {
    private final double x;
    private final double y;
    private final Radius1 radius;

//    public Point1(double x, double y, Radius radius) {
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//    }

    public Point3(double x, double y, Radius1 radius) {
        this.x = x;
        this.y = y;
        Radius1 clone = new Radius1();
        clone.setStart(radius.getStart());
        clone.setEnd(radius.getEnd());

        this.radius = clone;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

//    public Radius getRadius() {
//        return radius;
//    }

    public Radius getRadius() {
        Radius clone = new Radius();
        clone.setStart(radius.getStart());
        clone.setEnd(radius.getEnd());
        return clone;
    }


}

public class CloningThroughSerialization {
    public static void main(String[] args) {
        Radius1 r = new Radius1();
        r.setStart(1);
        r.setEnd(10);

        Point3 point3 = new Point3(3, 8, r);

        Point3 poin3Clone = null;

        poin3Clone = cloneThroughSerializer(point3);


        System.out.println(poin3Clone.getX());
    }

    public static <T> T cloneThroughSerializer(T t) {
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(t);

            ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(bais);

            return (T) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
            return t;
        }
    }
}
