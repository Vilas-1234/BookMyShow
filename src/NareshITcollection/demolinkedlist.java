package NareshITcollection;

import java.util.ArrayList;
import java.util.LinkedList;

public class demolinkedlist {
    public static void main(String[] args) {
demolinkedlist dl= new demolinkedlist ();
dl.arraylist () ;
dl.linkedlist ();
dl.meth ();
    }
    private  static Object arr[];
    static {
        arr=new Object[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=new Object ();
        }
    }
    void arraylist(){
        long start;
        long end;
        ArrayList <Object>ar= new ArrayList<Object> ();
        start=System.currentTimeMillis ();
//        System.out.println (start );
        for (Object ob:arr) {
            ar.add (ob);
        }
        end=System.currentTimeMillis ();
//        System.out.println (end );
        System.out.println (end-start );
    }
    void linkedlist(){
        long start,end;
        LinkedList<Object> ll=new LinkedList <Object>();
        start=System.currentTimeMillis ();
//        System.out.println (start );
        for (Object ob:arr) {
            ll.add (ob);
        }
        end=System.currentTimeMillis ();
//        System.out.println (end );
        System.out.println (end-start );
    }
    void meth(){
        for (Object ob:arr) {
//            System.out.println (ob );
        }
    }
}
