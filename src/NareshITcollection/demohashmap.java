package NareshITcollection;

import java.security.KeyStore;
import java.util.Map.Entry;
import java.util.*;
import java.util.stream.Stream;

public class demohashmap {
    public static void main(String[] args) {
demohashmap hm= new demohashmap ();
hm.show ();
    }
    public void show() {
        HashMap hm = new HashMap ( );
        //hashmap contain values based on key...
        //hashmap is a add the elements of key or value formate...
        //it was introduced in jdk 1.2 version ...
        // it does not follow the insertion order...
        // it does not follow the insertion order...
        // the initial capacity hashmap is 16 and load factor is 0.75%
        // when a map is elements add the 75% is full then it will  increase double  hash map capacity...
        //map contain only unique key but  values can duplicate ...
        // underlying data structure of hashmap is Hashtable ...
        hm.put (5, 56);
        hm.put (6, 98);
        hm.put (4, 86);
        hm.put (3, 76);
        hm.put (103, 76);
        hm.put (1, 46);
        hm.put (200, 4);
        hm.put (300, 4);
        hm.put (400, 4);
        hm.put (500, 4);
        hm.put (600, 4);
        hm.put (700, 4);
        hm.put (800, 4);
        hm.put (900, 4);
        hm.put (2, 36);
        hm.put (0, 16);
        System.out.println (hm);
//        hm.replace (2,"vilas");
        System.out.println (hm);
        LinkedHashSet hs= new LinkedHashSet ( hm.entrySet () );

        Iterator <Objects> it=hs.iterator ( );
        while (it.hasNext ()){

        }
    }
    }

