public class JavaThrowKeyword {
    
    // function to check weather the person is eligible to vote 
    public static void validate(int age){
        if (age < 18){
            throw new ArithmeticException("Age must be greater than 18 to vote");
        }
        else {
            System.out.println("You are eligile to vote");
        }
    }

    public static void main(String[] args) {
        // validate(15);
        validate(18);
    }
}
