// import java.util.Objects;

// public class CheckNullAndThrowingNullPointerExc {
//     private final String name;
//     private final Color color;

//     public CheckNullAndThrowingNullPointerExc(String name, Color color){
//         // if (name == null){
//         //     throw new NullPointerException("Car name cannot be null");
//         // }
//         // if (color == null) {
//         //     throw new NullPointerException("Car color cannot be null");
//         // }
//         this.name = name;
//         this.color = color;


//         this.name = Objects.requireNonNull(name, "Car name cannot be null");
//         this.color = Objects.requireNonNull(color, "Car color cannot be null");
//     }

//     public void assignDriver(String license, Point location){
//         // if (license == null) {
//         //     throw new NullPointerException("License cannot be null")
//         // }
//         // if (location == null) {
//         //     throw new NullPointerException("location cannot be null")
//         // }

//         Objects.requireNonNull(license, "Driver must have license");
//         Objects.requireNonNull(location, "Driver must give pickup location");

//     }
// }

import java.awt.*;
import java.util.Objects;

public class CheckNullAndThrowingNullPointerExc {
    private final String name;
    private final String color;

    public CheckNullAndThrowingNullPointerExc(String name, String color) {
        this.name = Objects.requireNonNull(name);
        this.color = Objects.requireNonNull(color);
    }

    public static void assignDriver(String license, Point location){
        Objects.requireNonNull(license, "License cannot be null");
        Objects.requireNonNull(location, "Location cannot be null");
    }

    public static void main(String[] args) {
        Point p1 = new Point(3,4);
        assignDriver("Sandip License", null);
    }
}
