package practical;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;

public class vectordemo {
    public static void main(String[] args) {
        vectordemo v= new vectordemo ();
        v.showO ();
    }
    public void showO(){
        Vector vc= new Vector ();
        vc.add ("Vilas");
        vc.add ("Basvaraj");
        vc.add ("Ashish");
        vc.add ("Ganesh");
        vc.add ("Vishal");
        vc.add ("Neeraj");
        System.out.println (vc );
//        Enumeration e= vc.elements ();
//        while (e.hasMoreElements ()){
//            System.out.println (e.nextElement () );
//            try {
//                Thread.sleep (2000);
//            }
//            catch (Exception f){
//                System.out.println (f );
//            }

        ListIterator itl= vc.listIterator ();
        while (itl.hasNext ()){
            System.out.println (itl.previous () );
            break;
        }
        System.out.println (vc );
        }
    }
