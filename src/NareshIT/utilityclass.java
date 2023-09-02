package NareshIT;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Stack;

public  class utilityclass {
    public static void main(String[] args) {
        Stack st= new Stack ();
        st.push ("vikas");
        st.push ("vinay");
        st.push ("raj");
        st.push ("raj");
        st.push (null);
        st.push (null);
        System.out.println (st );
        System.out.println (st.peek () );
        System.out.println (st.search ("raj") );
        System.out.println ();
        Enumeration e=st.elements ();
        while (e.hasMoreElements ()){
            System.out.println (e.nextElement () );
        }
        System.out.println (st.elementAt (0) );
        ArrayList al= new ArrayList ();
        al.add ("vilas");
        al.add ("vishal");
        al.add (55);
        al.add ("ravan");
        al.add ("ganesh");
        al.add ('V');
        al.add (55.5);
        System.out.println (al );




    }
}
