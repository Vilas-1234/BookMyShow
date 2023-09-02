package practiceCollecion;

import java.util.HashSet;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Navigableset {
    public static void main(String[] args) {
        NavigableSet set=new TreeSet ();
        set.add (25);
        set.add (12);
        set.add (47);
        set.add (13);
        set.add (11);
        System.out.println (set );
        Iterator it= set.iterator ();
        while (it.hasNext ()){
            System.out.println (it.next ());
        }
        System.out.println ();

    }
}
