package NareshITcollection;

import java.util.*;

public class demolinkedhashmap {
    public static void main(String[] args) {
        demolinkedhashmap lhm=new demolinkedhashmap ();
        lhm.show ();
    }
    public void show(){
        LinkedHashMap lm= new LinkedHashMap ();
        lm.put (6,"vilas");
        lm.put (2,"vilas");
        lm.put (11,"vilas");
        lm.put (13,"vilas");
        lm.put (5,"vilas");
        lm.put (9,"vilas");
        lm.put ("vilas","vilas");
        lm.put (10,"vilas");
        lm.put (10,"vilas");
        lm.put (12,"vilas");
        //  if the key value is not allow the duplicates ...
        // valuse of allow the duplicate values...
        //it is non synchronized...
        //heterogeneous data and heteerogeneous key
        // null key allow the only one null value aplicable and we can  values of null
        // it is follow the insertion order...
        // it was introduced in jdk 1.4 version...
        //it is  also values based on key...
        // it is not follow to the sorting order...
        // the underlyinng data structure is linked list and hashtable...
        //the default capacity of the 16...
        // then the map is full by a0.75% then it will increase in double...
        System.out.println (lm );

        }
    }
