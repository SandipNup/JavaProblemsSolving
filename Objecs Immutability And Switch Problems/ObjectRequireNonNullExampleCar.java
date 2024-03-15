import java.awt.*;
import java.awt.Color;
import java.util.Objects;

public class ObjectRequireNonNullExampleCar {
    private  String name;
    private  Color color;

    public ObjectRequireNonNullExampleCar(String name, Color color){
        if(name==null){throw  new NullPointerException(("Name cannot be null"));};
        if(color==null){throw new NullPointerException("color cannot be null");};

        this.name = name;
        this.color = color;
    }

    public void assignDriver(String license, Point location){
        if(license == null) throw new NullPointerException("License cannot be null");
        if(location == null) throw new NullPointerException("location cannot be null");
    }

    // Above two methods can be written using Objects.requireNonNull() as

    public void objectRequireNonNullExampleCarSetter(String name, Color color){
        this.name = Objects.requireNonNull(name,"message cannot be null");
        this.color = Objects.requireNonNull(color, "color cannot be null");
    }

    public void assignDriverSetter(String license, Point location){
        Objects.requireNonNull(license, "license cannot be null");
        Objects.requireNonNull(location, "location cannot be null");
    }

}
