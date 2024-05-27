package HashMapAndHashTable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer,String>();
        hm.put(0, "hello");
        hm.put(1, "Goodbye");
        hm.put(42, "Morning");
        hm.put(3, " Evening");

        System.out.println(hm.get(42));
        Set sn = hm.entrySet();
        Iterator it = sn.iterator();
        //hashtable -pass table set collections
        while(it.hasNext()){
            System.out.println(it.next());
            Map.Entry mp = (Map.Entry)it.next();
            System.out.println(mp.getKey());
            System.out.println(mp.getValue());
        }
    }
}
