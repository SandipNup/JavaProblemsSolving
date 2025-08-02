import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class VarExample {

    public Object fetchTransferableDate(String data) throws UnsupportedFlavorException, IOException {
        StringSelection ss = new StringSelection(data);
        DataFlavor[] df = ss.getTransferDataFlavors();
        Object obj = ss.getTransferData(df[0]);
        return obj;
    }

    public Object fetchTransferableData1(String data) throws UnsupportedFlavorException, IOException {
        var ss = new StringSelection(data);
        var df = ss.getTransferDataFlavors();
        var obj = ss.getTransferData(df[0]);
        return obj;
    }

    // providing meaningful name to localVariable when relying on LVTI
    public Object fetchTransferableData(String data) throws UnsupportedFlavorException, IOException {
        var stringSelection = new StringSelection(data);
        var dataFlavors = stringSelection.getTransferDataFlavors();
        var obj = stringSelection.getTransferData(dataFlavors[0]);
        return obj;
    }

    public static void main(String[] args) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        //using var keyword
        var map1 = new HashMap<>();

    }
}
