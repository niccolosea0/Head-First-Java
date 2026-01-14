import java.util.*;
import java.util.stream.*;

public class PracticeStreams {
    public static void main(String[] args) {

        List<String> strings = List.of("I", "am", "a", "list", "of", "strings");

        List<String> result = strings.stream() 
                                     .limit(4) // Intermadiate operation
                                     .collect(Collectors.toList()); // Terminal operation

        System.out.println("result: " + result);
        System.out.println("result2: " + strings);


        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");
        list.add("six");

        System.out.println("\nlist: " + list);
        List<String> listStream = list.stream()
                                      .skip(3)
                                      .collect(Collectors.toList());
        list.add("seven");
        System.out.println("List Stream: " + listStream);
        System.out.println("list: " + list);
     
    }
}
