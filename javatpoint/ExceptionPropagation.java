public class ExceptionPropagation {
    void m(){
        int data = 50/0;
        System.out.println(data);
    }

    void n(){
        m();
    }

    void p(){
        try{
            n();
        } catch (Exception e){
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.p();
        System.out.println("normal flow...");
    }
    
}
