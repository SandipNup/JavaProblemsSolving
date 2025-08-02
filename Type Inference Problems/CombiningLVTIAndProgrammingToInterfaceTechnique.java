import javax.imageio.stream.MemoryCacheImageInputStream;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class CombiningLVTIAndProgrammingToInterfaceTechnique {
//    MemoryCacheImageInputStream is = new MemoryCacheImageInputStream();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        // using var keyword

        var list1 = new ArrayList<>(); // if we do not send anything in the arraylist it will infer varible type to ArrayList<Object>
        var list2 = new ArrayList<String>(); // infer variable type to ArrayList<String>

        var playerStack = new ArrayDeque<String>();

        // inferred as ArrayList<String>
        var playerList = new ArrayList<>(playerStack);

    }
}
