package Stream;

import java.util.ArrayList;

public class regularStreamDemo {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();

        names.add("Adam");
        names.add("jason");
        names.add("Dudi");
        names.add("Angga");

        int count=0;
        for(int i=0;i<names.size();i++) {
            String actual = names.get(i);
            if(actual.startsWith("A")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
