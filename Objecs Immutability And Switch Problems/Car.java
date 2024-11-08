import java.awt.Color;
import java.util.Objects;

public class Car {
    private final String name;
    private final Color color;

    public Car(String name, Color color){
        this.name = Objects.requireNonNullElse(name, "No Name");
        this.color = Objects.requireNonNullElseGet(color, ()-> new Color(0,0,0));
    }

}
