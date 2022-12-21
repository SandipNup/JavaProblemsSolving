public class StaticNestedClass {
    static int data = 30;

    static class Inner {
        void msg(){
            System.out.println("Inner class" + data);
        }

    }

    static class Inner2 {
        static void msg(){
            System.out.println("Inner2" + data);
        }
    }

    public static void main(String[] args) {
        StaticNestedClass.Inner obj = new StaticNestedClass.Inner();
        obj.msg();
        StaticNestedClass.Inner2.msg();
    }
}
