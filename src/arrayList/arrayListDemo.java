package arrayList;

import java.util.ArrayList;

public class arrayListDemo {
    // can accept duplicate values
    //ArraList,LinkedList,vector- Implementing List interface
    //array have fixed size where as arraylist can grow dynamicaly
    //you can access and insert any value in any index

    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>();

        a.add("Izi");
        a.add("learn");
        a.add(2, "java");
        System.out.println(a);
        a.remove(0);
        System.out.println(a);
        System.out.println(a.get(1));
        System.out.println(a.contains("testing"));
        System.out.println(a.indexOf("java"));
        System.out.println(a.isEmpty());
        System.out.println(a.size());
    }
}
