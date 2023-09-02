package NareshItJava8features;

import org.omg.CORBA.WStringSeqHelper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoStream {
void show(){
    Functionalinterface fi=  a-> System.out.println (a);
    fi.meth1 (100);
    ArrayList ar= new ArrayList (  );
    ar.add ("vilas");
    ar.add ("rajesh");
    ar.add ("ramesh");
    ar.add ("suresh");
    ar.add ("somesh");
//    Stream<String> st=ar.stream ();
//  Stream <String> srr=st.filter (x->x.length ()>=6);
//  long l=srr.count ();
//    System.out.println (l );
//    Stream<String>st1=st.map (e->e.concat ("patil"));
//    List<String> l=st1.collect (Collectors.toList ());
//    System.out.println (l );
//    int arr[]={5,4,3,28,97,61,2,36,7,1};
//    ArrayList al= new ArrayList (Arrays.asList (arr));
    Stream<String> st=ar.stream ().sorted ();
    List<String>st1=st.collect(Collectors.toList());
    System.out.println (st1 );
    //    Stream<Integer> t=st.filter (e->e*8)
}

    public static void main(String[] args) {
        new DemoStream ().show ();
    }
    @FunctionalInterface
    interface  Functionalinterface{
        void meth1(int a);
    }
}
