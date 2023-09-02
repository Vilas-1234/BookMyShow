package NareshITcollection;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class demovector {
    public static void main(String[] args) {
demovector dm= new demovector ();
dm.show ();
    }
    void show(){
        Vector vc= new Vector (  );
        //it is  index based ...
        //when we add the element first that element
        // will add the zero th index and second same as follow to next index position...
        // it is follow the  insertion order ...
        // we can write the any null values...
        // we can write the any duplicate values...
        // it was introduced in jdk1.0 version ...
        // it is a legacy class...
        // the default capacity of a vector is 10
        // new capacity of vector is old capacity * 2 = 20 ...
        // it is a synchronized....
        //capacity method means how many elements we can add ...
        //size method means how many elements are present...
//        vc.add ("vilas");
//        //we can add the heterogenous data into the vectorn
//        vc.add ("ram");
//        vc.add ("ravan");
//        vc.add ("basu");
//        vc.add ("ram");
//        vc.add ("ashis");

        vc.add (5);
        vc.add (9);
        vc.add (7);
        vc.add (1);
        vc.add (4);
        // we can access the element from the iterator interface and Enumeration interface...
//        Iterator it = vc.iterator ();
//        while (it.hasNext ()){
//            System.out.println (it.next () );
//        }
//       // Enumeration e= vc.elements ();
//        while (e.hasMoreElements ()){
//            System.out.println (e.nextElement () );
//        }
        //when we want the that list we can sort it then we can use the Collections class
        // in that class sort method is available for the sorting ;
     Collections.sort (vc);
        System.out.println (vc );
        System.out.println (vc.remove ((Object)9) );
        //if we want to remove the integer element from the list that time
        //we can try that then it will the index that time we can use the typecasting
        //from object ...
        vc.addElement (8);
        //when we add the element into the vector this element will add the last index position...
        System.out.println ( vc.elementAt (2));
        System.out.println (vc.get (2) );
        // get method and elementAt method  those work will be same but get method is List interface
        //and elementAt method is vector class method...
        //those methods  return   the element from the specific index position...
        System.out.println (vc );
    }
            }