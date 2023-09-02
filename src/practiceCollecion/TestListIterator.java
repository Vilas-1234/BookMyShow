package practiceCollecion;

import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {
    public static void Forword(){
        ArrayList arr=new ArrayList ();
        arr.add ("AAA");
        arr.add ("BBB");
        arr.add ("CCC");
        System.out.println (arr );
        ListIterator ll=arr.listIterator ();
        while (ll.hasNext ())
        {

            String st=(String) ll.next ();
            if (st.equals ("AAA")){
               ll.add ("XXX");
            }
            if (st.equals ("BBB")){
                ll.add ("YYY");
            }
            if (st.equals ("CCC")){
                ll.remove ();
            }
        }
        System.out.println (arr );
    }
    public static void Backword(){
        ArrayList ar=new ArrayList ();
        ar.add ("VVV");
        ar.add ("MMM");
        ar.add ("NNN");
        ar.add ("OOO");
        ar.add ("PPP");
        ListIterator list=ar.listIterator ();
    }


    public static void main(String[] args) {
    Forword ();
    }
}
