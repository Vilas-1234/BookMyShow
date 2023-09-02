package NareshITcollection;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class demoidentity {
    public static void main(String[] args) {
        demoidentity id= new demoidentity ();
        id.show();
    }
    public void show(){
        HashMap hm= new HashMap ();
        hm.put (101,"vilas");
        hm.put (101,"vilas");
        System.out.println (hm );
        System.out.println ("----------------------- ----" );
        IdentityHashMap idm= new IdentityHashMap (  );
        idm.put (101,"vilas");
        idm.put (101,"vilas");
        System.out.println (idm );
    }
}
