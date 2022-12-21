interface Eatable{
    void eat();
}

public class AnonymousUsingInterface {
    public static void main(String[] args) {
        Eatable e = new Eatable() {
            @Override
            public void eat() {
                System.out.println("I am going to eat all of these");
            }
        };
        e.eat();
    }
}
