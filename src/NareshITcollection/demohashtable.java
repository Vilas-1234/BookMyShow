package NareshITcollection;

import java.util.Hashtable;

public class demohashtable {
    public static void main(String[] args) {
        demohashtable ht= new demohashtable ();
ht.show ();

    }
    public void show(){
        Hashtable hs= new Hashtable (  );
        hs.put (3,55);
        hs.put (2,"abhay");
        hs.put (4,'c');
        hs.put ("vilas",20.5555);
        hs.put (6,4568445);
        hs.put (1,5.5f);
        //it can not followed  by insertion order...
        //it does not allow to the sorting order...
        // we can add the heterogeneous data at key and values...
        //it can contain the elements are form of key and values...
        //null value and key is not allow...
        // it contain only duplicate values  except key value...
        // hashtable is legacy class  which is present in java.util package...
        // it was intorduced in jdk 1.0  version...
         // the default capacity of hashtable is 11...
        // and load factor is 0.75% if full then intial capacity is increses by double...
        // it is synchronized...
        // the underlying data structure is hashtable...

        System.out.println (hs );
    }
}
