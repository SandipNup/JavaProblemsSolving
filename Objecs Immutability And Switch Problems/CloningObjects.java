import java.awt.*;

class Point2 implements Cloneable{
    private int x;
    private int y;

    public Point2(){}
    public Point2(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point2(Point2 point2){
        this.x = point2.x;
        this.y= point2.y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Manual Cloning
    public Point2 clonePoint(){
        Point2 point = new Point2();
        point.x = this.x;
        point.y = this.y;

        return point;
    }

    @Override
    protected Point2 clone() throws CloneNotSupportedException {
        return (Point2) super.clone();
    }
}

public class CloningObjects {
    public static void main(String[] args) {
        // Mannual way of cloning
        Point2 pont21 = new Point2(5,7);
        Point2 point21Clone= pont21.clonePoint();

        // Using clonable interface and object clone method
        Point2 pont212 = new Point2(9,7);

        try {
            Point2 point212Clone = pont212.clone();
            System.out.println(point212Clone.getX());
            System.out.println(point212Clone.hashCode());
            System.out.println(pont212.hashCode());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


        // cloning through the constuctor
        Point2 point2123Clone = new Point2(5,100);
        Point2 clone = new Point2(point2123Clone);



    }
}
