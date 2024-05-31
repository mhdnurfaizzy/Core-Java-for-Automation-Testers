import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamCollect {

    @Test
    public void streamCollect() {

        //get value from list and collect then get by index value
        List<String> ls = Stream.of("Adam","Jason","Dudi","Angga", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
                .collect(Collectors.toList());
        System.out.println(ls.get(0));

        //Print unique number from this array
        //then sort the array - and get 3rd index
        List<Integer> values = Arrays.asList(1,2,2,4,5,7,9,7);
        values.stream().distinct().forEach(s-> System.out.println(s)); //print unique number using func distinc()
        System.out.println("");
        List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList()); //get the 3rd index
        System.out.println(li.get(2));
    }
}
