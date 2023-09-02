package NareshITcollection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class demohashset {
    public static void main(String[] args) {
demohashset hs=new demohashset ();
hs.show ();
    }
    void show() {
        HashSet hs = new HashSet ( );
        hs.add (55);
        hs.add (47);
        hs.add ("vilas");
        hs.add (85);
        hs.add (68);
        hs.add (90);
        hs.add (12);
        hs.add (28);
        hs.add (28);
        // hashset is not index based  it value store in hashcode value ...
        //hashset underlying data structure is Hashtable...
        //insertion order is not maintained...
        //Heterogeneous data is allowed ...
        //null value is allowed . we can add only one null value...
        //duplicate value is not allowed ... we can add the duplicate values
        // then compiler not getting  error . it  is not display  the output ...
        // it was introduced in jdk 1.2 version...
        //default capacity of hashset is 16... if the capacity is full
        // comlete then it will increase the double...
        // hashset is not allowed  sorting order...
        //  it is not synchronized...
        System.out.println (hs.hashCode ( ));
        System.out.println (hs);
//        Collections.sort (hs); it is not allowed  sorting order....
//          we can iterator by using iterator class...
        Iterator it = hs.iterator ( );
        while (it.hasNext ( )) {
            System.out.println (it.next ( ));
        }

    }
}
