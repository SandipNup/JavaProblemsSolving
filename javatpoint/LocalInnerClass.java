public class LocalInnerClass{
    private int data = 30;

    void display(){
        class Local{
            void msg(){ 
                System.out.println(data);
            }
        }

        Local i = new Local();
        i.msg();
    }

    public static void main(String[] args) {
        LocalInnerClass obj= new LocalInnerClass();
        obj.display();
    }
}