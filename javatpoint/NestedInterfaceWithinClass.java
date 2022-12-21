class TestNestedInterface {
    interface Message{
        void msg();
    }
}

public class NestedInterfaceWithinClass implements TestNestedInterface.Message{

    public void msg(){
        System.out.println("Printing the message");
    }

    public static void main(String[] args) {
        TestNestedInterface.Message inter = new NestedInterfaceWithinClass();
        inter.msg();
    }

}

