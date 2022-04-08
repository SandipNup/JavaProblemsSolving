class CustomException extends Exception{
    public CustomException(String str){
        super(str);
    }
}

public class JavaUserDefinedExceptions {

    static void testThrow(){
        try{
            throw new CustomException("This is my own defined exception");

        }catch(CustomException e){
            System.out.println("Custonn exception is handled here");
        }
    }
    public static void main(String[] args) {
        testThrow();
    }
}
