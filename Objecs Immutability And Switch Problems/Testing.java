import java.util.*;
import java.util.stream.Stream;

class Testing{
    public static void main(String[] args) {


        Integer[] arr = {1,2,null,4,5};

        List<Integer> arrList = Arrays.asList(arr);
        for(Integer i: arrList){
           // System.out.println(Objects.isNull(i));
        }

        Collection<String> listOne = new ArrayList(Arrays.asList("a", "b","c","d","e","f","g"));
        Collection<String> listTwo = new ArrayList(Arrays.asList("a", "b","d","e","f","gg","h"));
        List<String> sourceList = new ArrayList<String>(listOne);
        List<String> destinationList= new ArrayList<String>(listTwo);
        sourceList.removeAll(listTwo);
        destinationList.removeAll(listOne);

        System.out.println(sourceList);
        System.out.println(destinationList);
    }
}