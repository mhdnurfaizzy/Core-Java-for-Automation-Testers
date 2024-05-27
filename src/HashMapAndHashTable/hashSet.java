package HashMapAndHashTable;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        //HashSet treeSet, LinkedHashSet implements Set interface
        //does not duplicate value
        //There is no guarantee elements stored in sequential order..Random order

        HashSet<String> hs = new HashSet<String>();
        hs.add("USA");
        hs.add("Indonesia");
        hs.add("UK");
        hs.add("Indonesia");
        System.out.println(hs);
        System.out.println(hs.remove("UK"));
        System.out.println(hs.size());

        //Iterator
        Iterator<String> i = hs.iterator();
        while(i.hasNext()) {
            System.out.println(i.next()); //print the collection each of index
        }

    }
}
