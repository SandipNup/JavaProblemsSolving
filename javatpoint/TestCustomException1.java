class InvalidAgeException extends Exception{
    public InvalidAgeException(String str){
        super(str);
    }
}

public class TestCustomException1 {
    static void validate(int age) throws InvalidAgeException{
        if(age < 18){
            throw new InvalidAgeException("You are not authorized to vote");
        }else{
            System.out.println("You Can vote");
        }
    }

    public static void main(String[] args) {
        try{
            validate(10);
        }catch (InvalidAgeException e){
            System.out.println("Exception is handled here");
        }
    }
}
