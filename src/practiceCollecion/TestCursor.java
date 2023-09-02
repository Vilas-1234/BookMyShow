package practiceCollecion;

import java.util.*;

public class TestCursor {

    public static void main(String[] args) {

        Vector v= new Vector ();
        v.add ("vilas");
        v.add ("vishal");
        v.add ("Ganesh");
        v.add ("ashish");
        v.add (5);
        Enumeration e=v.elements ();
        while (e.hasMoreElements ()) {
            System.out.println (e.nextElement ( ));
//            if (v.elements ( ).equals ("vishal")) {
//                v.removeElement ("Ganesh");
//            } else {
//                System.out.println (e.nextElement ( ));
//            }
        }
        ArrayList ar= new ArrayList ();
        ar.add (55);
        ar.add (45);
        ar.add (11);
        ar.add (78);
        ar.add (99);
        System.out.println (ar);
        Iterator it=ar.iterator ();
        while (it.hasNext ()){
            Integer element=(Integer) it.next ();
            System.out.println (element );
            if (element==55){
                ar.remove (1);
            }
            System.out.println (ar );
        }

    }
}
