package NareshITcollection;

import java.security.KeyStore;
import java.util.*;

public class demotreemap {
    public static void main(String[] args) {
demotreemap ttt= new demotreemap ();
ttt.show ();
    }
    public void show(){
        TreeMap tm= new TreeMap ();
        tm.put (1,25);
        tm.put (2,25);
        tm.put (5,25);
        tm.put (6,25);
        tm.put (0,5);
        tm.put (3,25);
        tm.put (4,25);
        tm.put (3,25);
        tm.put (0,25);
        tm.put (0,26);
        tm.put (8,25);
        tm.put (7,25);
//        System.out.println (tm );
        //insertion ordder is not allowed ...
        //it allow the only homogeneous data...
        // tree  map is allowed the sorting order...
        //it was introduced in jdk 1.2 version...
        // the default capacity of treemap is 16.
        // map is full in 75% then it will increase in double...
        // it is non synchronized...
        // if we can add the any number off null value as a key then it
        //will geting the error...
        //if we can add the any duplicate values and key then it key is ignored by
        //first  duplicate key and last key is printed...
//        TreeMap tttt = new TreeMap (  );
        SortedMap sm= new TreeMap (  );
        sm.putAll (tm);
        System.out.println (sm );
        System.out.println (sm.headMap (5) );
        System.out.println (sm.subMap (2,5) );// it is work  as a substring method...
        Iterator it =new LinkedHashSet<Objects>( sm.entrySet ()).iterator ();
        while (it.hasNext ( )){
            System.out.println (it.next () );
        }
    }
}
