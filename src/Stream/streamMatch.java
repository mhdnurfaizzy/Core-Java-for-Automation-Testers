package Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamMatch {

    @Test
    public void streamMatch() {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Adam");
        names.add("jason");
        names.add("Don");
        names.add("Angga");
        names.add("Ram");

        //Print names which have first letter as a with uppercase and sorted
        List<String> names1 = Arrays.asList("Adam","Jason","Dudi","Angga", "Rama");
        names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).forEach(s-> System.out.println(s));

        //Assert value between two arrayList names and names1
        Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
        boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
        System.out.println(flag);
        Assert.assertTrue(flag);

    }
}
