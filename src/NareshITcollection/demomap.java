package NareshITcollection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class demomap {
    public static void main(String[] args) {
        demomap map= new demomap ();
        map.show();
    }
    public void show(){
        Scanner sc= new Scanner (System.in);
//        System.out.println ("enter the  array size" );
//        int size = sc.nextInt ();
//        int arr[]=new int[size];
//        System.out.println ("enter the array elements " );
//       Map map= new HashMap ();
//        for (int i = 0; i < 6; i++) {
//            map.put (i,sc.nextInt ());
//        }
//        System.out.println (map );
        Map m= new HashMap (  );
        //we want de declare as key and value form...
        // it was introduced in jdk 1.2 version...
        //we will elements add into the key and values formate...
        //in that map we can not add the keys are duplicates...
        // if we can write the values duplicate but does not key is duplicate...
          // map does not follow the insertion order...
        // map does not follow the sorting order...
        m.put (5,"vilas");
        m.put (4,25);
        System.out.println (m.get (2) );
        System.out.println (m.keySet () );
        System.out.println (m );
    }
}
