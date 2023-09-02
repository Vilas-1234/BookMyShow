package NareshITcollection;

import java.util.*;
import java .util.Scanner;
public class list {
    public static void main(String[] args) {
        list l= new list ();
        l.show ();
    }
    void show(){
        List l= new ArrayList ();
        //  if we can use the generic then we do not add the heterogenous data

            l.add (10);
            l.add ("vilas");
            l.add ('c');
            l.add (2.2f);
            l.add (92.0);
            l.add (101);
        for (int i =l.size ()-1; i >=0 ; i--) {
            System.out.println (l.get (i) );
        }
        System.out.println ( );
        for (Object i:l) {
            System.out.println (i );
        }

        l.stream ().forEach (e-> System.out.println ("element = " +e));
       // we can add  any duplicate  values in to the list ...
       // if we add any element into the list then it  will add from a last index of the list...
        // we  can use the delete method we need to a specific index we want to a that element to delete ...

        l.set (5,8);// if we can set the value from a particular index position  then add the element  that position
        //and old element is  remove form the list ...
        System.out.println ( );
        Iterator tr=l.iterator ();
        while(tr.hasNext ()==true){// how to retrive the data from a collection classes...
            // we can retrive the data by 3 way 1 is Iterator interface  ListIterator and Enumuration interface
            // in that interface java provide the multiple method then we can use that method and retrive the data from a
            //collection class
            //2 nd is by useing for-each loop...
            // 3rd is by using for loop...
            System.out.print (tr.next ()+",");
        }
        ListIterator lr=l.listIterator ();
        while (lr.hasNext ()==true){
            System.out.print (lr.next ()+ "," );
        }
        System.out.println ( );
        l.stream ().forEach (element -> System.out.println ());
        l.stream ();
        System.out.println (l.get (5) );;;
        l.set (5,6);

        System.out.println (l);
    }
}
