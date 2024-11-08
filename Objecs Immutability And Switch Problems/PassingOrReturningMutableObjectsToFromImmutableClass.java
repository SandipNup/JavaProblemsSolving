
class Radius {
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

final class Point1 {
    private final double x;
    private final double y;
    private final Radius radius;

//    public Point1(double x, double y, Radius radius) {
//        this.x = x;
//        this.y = y;
//        this.radius = radius;
//    }

    public Point1(double x, double y, Radius radius) {
        this.x = x;
        this.y = y;
        Radius clone = new Radius();
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

public class PassingOrReturningMutableObjectsToFromImmutableClass {
    public static void main(String[] args) {
        Radius radius = new Radius();
        radius.setStart(0);
        radius.setEnd(100);

        Point1 point1 = new Point1(6,9,radius);
        System.out.println("P1 Statrt: " + point1.getRadius().getStart());
        point1.getRadius().setStart(6);
        System.out.println("P1 Statrt: " + point1.getRadius().getStart());
    }
}
