package NareshItJava8features;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.stream.Stream;

public class demoapi {
    public static void main(String[] args) {
demoapi da= new demoapi ();
da.show ();

    }
    public void show(){
        ArrayList ar= new ArrayList ();
//        ar.add ("yogesh");
//        ar.add ("awadhut");
//        ar.add ("srinath");
//        ar.add ("vishal");
//        ar.add ("ashish");
//        ar.add ("vilas");
//        ar.add ("raj");
//        ar.add ("sham");
//        ar.add ("jayant");
//        ar.add ("rahul");
//        ar.add ("basvaraj");
//        ar.add ("ganesh");
        ar.add (1) ;
        ar.add (5);
        ar.add (3);
        ar.add (7);
        ar.add (9);
        ar.add (11);
        Collections.sort (ar);
        System.out.println (ar );
//        ar.forEach (x-> System.out.println (x));
        Stream <Integer >st =ar.stream ();
//        long s= st.filter (s1->s1.startsWith ("s")).count () ;
//        System.out.println (s);
//        Stream <String> str= st.filter(e -> e.substring (1,4) == "vilas");
//        long count=str.count ();
//        System.out.println (count);
        st.map (s->s*3).forEach(System.out::println);

    }
}
