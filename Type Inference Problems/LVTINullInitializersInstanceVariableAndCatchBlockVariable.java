import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class LVTINullInitializersInstanceVariableAndCatchBlockVariable {

    // LVTI cannot be used with instance variable

    // private var age; // This will not work

    public static void main(String[] args) {
        // LVTI cannot be used with null initializer
        //var a = null; // this will not work

        var ab = (String) null; // This will work if you explicit cast


//        try{
//            int a = 10 / 0;
//
//        }catch (var e){ // cannot use var here
//        }

        // try with resource works well with var
//
//        try (PrintWriter writer = new PrintWriter(System.out, true)) {
//            writer.println("Welcome Message");
//        }

        try (var pw = new PrintWriter(System.out, true)) {
            pw.println("World");
            pw.println("Welcome Message");
        }


    }
}
