package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamMap {
    //Steam Map can be using for manipulate value from original value
    public static void main(String[] args) {
        //print names which have last letter as "a" with Uppercase
       Stream.of("Adam","Jason","Dudi","Angga", "Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
                .forEach(s-> System.out.println(s));

       System.out.println("");

       //Print names which have first letter as a with uppercase and sorted
        List<String> names = Arrays.asList("Adam","Jason","Dudi","Angga", "Rama");
        names.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

    }
}
