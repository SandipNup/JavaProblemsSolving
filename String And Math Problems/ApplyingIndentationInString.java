import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ApplyingIndentationInString {

    public static void example1Indentation(){
        String days = "Sunday\n"
                + "Monday\n"
                + "Tuesday\n"
                + "Wednesday\n"
                + "Thursday\n"
                + "Friday\n"
                + "Saturday";

        System.out.println(days.indent(10));
    }

    public static void exampleIndentation2(){
        List<String> days = Arrays.asList("Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday");
        for(int i=0; i<days.size(); i++){
            System.out.println(days.get(i).indent(i));
        }

        days.stream().forEachOrdered((d) -> System.out.println(d.indent(d.length())));
    }

    public static void transformingStringExample(){
        String resultMap = Stream.of("Hello").map(s-> s + "world").findFirst().get();
        Stream.of("Hello").forEach(s-> System.out.println(s + "a"));
        System.out.println(resultMap);
    }

    public static void transformingExample2(){
        String resultMap = Stream.of("goool!  ").map(String::toUpperCase).map(s-> s.repeat(2)).map(s-> s.replaceAll("O", " OOO")).findFirst().get();
        System.out.println(resultMap);
    }

    public static void usingTransformMethodInString(){
        String resultMap = "goool!  ".transform(String::toUpperCase).transform(s -> s.repeat(2)).transform(s->s.replace("O", "000"));
        System.out.println(resultMap);
    }

    public static void main(String[] args) {
        example1Indentation();
        exampleIndentation2();
        transformingStringExample();
        transformingExample2();
        usingTransformMethodInString();
    }
}
