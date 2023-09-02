package NareshITcollection;

import java.util.ArrayList;
import java.util.stream.Stream;

public class demostreamapi {
    public static void main(String[] args) {
demostreamapi ds= new demostreamapi ();
ds.show ();
    }
    public void show(){
        ArrayList ar= new ArrayList ();
        ar.add (21) ;
        ar.add (45);
        ar.add (89);
        ar.add (23);
        ar.add (46);
        ar.add (94);
        Stream <Integer>st=ar.stream ();
        st.map (e->e>30).forEach (e-> System.out.println (e ));
    }
}
