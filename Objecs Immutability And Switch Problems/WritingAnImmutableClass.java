/*
An immutable class must respect several requirements, such as the following:
 The class should be marked as final to suppress extensibility (other
 classes cannot extend this class; therefore, they cannot override methods)
 All fields should be declared private and final (they are not visible in
 other classes, and they are initialized only once in the constructor of this
 class)
 The class should contain a parameterized public constructor (or a
 private constructor and factory methods for creating instances) that
 initializes the fields
 The class should provide getters for fields
 The class should not expose setters
 */

public final class WritingAnImmutableClass {
    private final double x;
    private final double y;

    public WritingAnImmutableClass(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public static void main(String[] args) {
        WritingAnImmutableClass immutableClassInstance = new WritingAnImmutableClass(8,9);
        // immutableClassInstance.x=9;  you will not be able to assign values to the final variable
        System.out.println(immutableClassInstance.getX());
        System.out.println(immutableClassInstance.getY());
    }
}
