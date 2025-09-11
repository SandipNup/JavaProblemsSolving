import java.util.ArrayList;
import java.util.List;

public class CombiningLVTIwithDiamondOperator {

    private class Person{
        private int age;
        private String name;

        public Person(int age, String name){
            this.age= age;
            this.name=name;
        }
    }

    public void CombiningLVTIWithDiamondOperator(){
        // before java 8 -->
         ArrayList<String> listOfString = new ArrayList<String>();

         // In java 7 introduce diamond operator
        ArrayList<String> listOfStrings = new ArrayList<>();

        var playList = new ArrayList<>(); // creates ArrayList<Object>

        var playList1 = new ArrayList<String>();  // creates ArrayList<String>

        Person person1 = new Person(12,"ankit");
        Person person2 = new Person(13,"sandy");

        var personList = List.of(person1,person2); // creates Array List<Person>
    }
    public static void main(String[] args) {

    }
}
