package NareshITcollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class test1 {
    public static void main(String[] args) {

        test1 t1 = new test1 ();
        t1.show ();

    }
    void show() {
        ArrayList<test> ar = new ArrayList<test> ( );
        //when we use the generics in collection if we want to specific object
        // is want to that time we can use generic concept...
        test t1 = new test (2, "basvraj", "Dcd");
        test t2 = new test (3, "ashish", "Dcd");
        test t5 = new test (1, "vilas", "Dcd");
        test t3 = new test (4, "vishal", "Dcd");
        test t4 = new test (5, "ganesh", "Dcd");
        ar.add (t2);
        ar.add (t1);
        ar.add (t3);
        ar.add (t5);
        ar.add (t4);
        System.out.println (ar);
        Collections.sort (ar,new test3 ());
        Iterator it=ar.iterator ();
        while (it.hasNext ()){
            System.out.println (it.next () );
        }
    }
}
