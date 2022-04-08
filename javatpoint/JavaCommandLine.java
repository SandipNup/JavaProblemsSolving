
public class JavaCommandLine {
    public static void main(String[] args) {
        System.out.println("Your first argument from command line is:" + args[0]);
        for(int i=0; i< args.length; i++){
            System.out.println(args[i]);
        }
    }
}
