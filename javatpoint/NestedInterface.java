interface Showable {
    void show();

    interface Printable{
        void print();
    }
}

public class NestedInterface implements Showable.Printable{
    public void print(){
        System.out.println("Print through printable");
    }

    public static void main(String[] args) {
        Showable.Printable print = new NestedInterface();

        print.print();
    }
}
