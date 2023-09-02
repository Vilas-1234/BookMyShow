package NareshITcollection;

import java.util.Arrays;
import java.util.TreeSet;

public class demotreeset {
    public static void main(String[] args) {
demotreeset tr= new demotreeset ();
tr.show ();
    }
    void show(){
        TreeSet tr= new TreeSet ();
      tr .add ("vilas");
        tr.add ("vikas");
        tr.add ("ram");
        tr.add ("rahul");
        tr.add ("vishal");
        tr.add ("ganesh");
        tr.add ("ashish");
        tr.add ("basvaraj");
        System.out.println ( tr);
        // it is not index based  D.S...
        //it  does not follow the  insertion order...
        // not allowed  heterogeneous data...
        // it allowed the   sorting order...
        // it  does not contain the duplicate values...
        //it was introdused in jdk 1.2 version...
        // we can store only one null value add the tree set...
        // it is a non synchronized...
        // the underlying data structure  tree set is ballanced tree...
        System.out.println ( tr.descendingSet () );
            Object[] arr =tr.toArray ();
            Object b= tr.clone ();
        System.out.println (b );
        for (int i = 0; i < arr.length; i++) {
            System.out.print (arr[i]+"," );
        }
        System.out.println (arr );
        System.out.println ( );
        System.out.println (tr.ceiling ("vilas") );
    }
}
