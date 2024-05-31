package Stream;

import java.util.ArrayList;
import java.util.stream.Stream;

public class streamFillterDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Adam");
        names.add("jason");
        names.add("Don");
        names.add("Angga");
        names.add("Ram");

        Long c = names.stream().filter(s->s.startsWith("A")).count(); // using lamba expression to fillter the value and count where value char start with "A"
        System.out.println(c);

        Long d = Stream.of("Adam","Jason","Dudi","Angga").filter(s->
        {
            s.startsWith("A");
            return true;
        }).count();
        System.out.println(d);

        //Print all the names of Arraylist
        names.stream().filter(s->s.length()>=4).forEach(s-> System.out.println(s));
        //print name but only 1 value
        names.stream().filter(a->a.length()>=4).limit(1).forEach(a-> System.out.println(a));


    }
}
