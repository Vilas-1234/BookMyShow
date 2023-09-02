package test1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class concurenthashmape {
    public static void main(String[] args) {
//        ConcurrentHashMap  u=new ConcurrentHashMap ();
//
//        u.put (2, "vilas");
//        u.put (1, "ram");
//        u.put (3, "ganesh");
//        Iterator it= u.values ( ).iterator ( );
//        while (it.hasNext ()){
//            System.out.println (it.next () );
//            u.remove (3);
//        }
        HashMap<Integer,String > h = new HashMap ();
        h.put (2, "vilas");
        h.put (4, "Rajat");
        h.put (1, "ram");
        h.put (3, "ganesh");
        Iterator i= h.values ( ).iterator ( );
        while (i.hasNext ()) {
            System.out.println (i.next ( ));

        }

    }
}
