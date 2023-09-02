package test1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

 class TestComparator {
     public static void main(String[] args) {
         ArrayList <show> ar= new ArrayList<> ();
         ar.add(new show (5, "vilas"));
         ar.add (new show (2, "Vishla"));
         ar.add (new show (1, "Ashish"));
         ar.add (new show (4, "shahaji"));
         ar.add (new show (5,"Ganesh"));
         Collections.sort (ar);
         for (show ss:ar) {
             System.out.println (" Id : "+ss.id+"\n  Name : "+ss.name);
         }
     }
 }
// class sss implements Comparator<show> {
//
//     @Override
//     public int compare(show o1, show o2) {
//         if (o1.name.equals(o2.name))
//             return 0;
//         else if ((o1.name.hashCode ())>(o2.name.hashCode ()))
//             return 1;
//         else
//             return -1;
//     }
// }

class show implements Comparable<show> {
    @Override
    public int compareTo(show o) {
 return name.compareTo (o.name);
    }

    int id;
    String name;

    public show(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

