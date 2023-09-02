package NareshItJava8features;

import java.util.ArrayList;
import java.util.stream.Stream;

public class streamapiprogram {
    public static void main(String args[]){
        ArrayList<Integer> ar= new ArrayList<Integer> (  );
        ar.add (12);
        ar.add (45);
        ar.add (5);
        ar.add (5);
        ar.add (2);
        ar.add (1);
        ArrayList<String> ar2=new ArrayList<> (  );
        ar2.add ("vinay");
        ar2.add ("vishal");
        ar2.add ("rajeshwar");
        ar2.add ("rameshwar");
        ar2.add ("parmeshwar");
        ar2.add ("vilas");

        Stream<Integer> st=ar.stream ();
        Stream <String> st1=ar2.stream ();
        // wap the print even number into the arraylist....
//        st.filter (e->e%2==0).forEach (System.out::println);//we call the :: is method reference...
        // wap the print all element is greater than 12 from the arraylist....
//        System.out.println (st.filter (e->e>=12).findFirst ( ).get () );//to find the any number of the first element...
        //wap the print the multiply by 2 from each element off the arraylist...
//        System.out.println (st.map (e-> (e*2)).collect(Collectors.toList()) );
        // wap the print the maximum value into the arraylist ....
//        int max =st.max ((a,b)->a.compareTo (b)).get ();
//        System.out.println (max );
//        Stream <Integer>st2=ar.stream ();
        //wap the print the minimum value int to the arraylist...
//       int min=st2.min ((a,b)->a.compareTo (b)).get ();
//        System.out.println (min );
//        System.out.println ( st.sorted ().collect(Collectors.toList()) );
        // wap the print the name whose length is greater than 6 into the arraylist...
//    st1.filter (e->e.length ()>=6).forEach (e-> System.out.println (e ));
        //wap the print each name the start from V in to the arraylist...
//    st1.filter (e->e.startsWith ("r")).forEach (e-> System.out.println (e ));
        // wap the print the square of  each number into the arraylist....
//        st.map (e->e*e).forEach (e-> System.out.println (e ));
        // wap the print replace the v character with @ character....
//        st1.map (e->e.replace ("v","@")).forEach (e-> System.out.println (e ));
        //wap a program to get the first element of a given string the String arraylist...
//        st1.map (e->e.substring (0,1)).forEach (e-> System.out.println (e ));
        //wap a program to sort the descending order from the String arraylist...
//        st1.sorted ( (s,p)->-s.compareTo (p) ).forEach (e-> System.out.println (e ));

        //wap a program to sort the descending order from the Integer arraylist.....
//        st.sorted ( (x,y)->-x.compareTo (y) ).forEach (e-> System.out.println (e ));
        //wap the print sum of the all even number into the arraylist...
//     List l=st.filter (e->e%2==0 ).collect(Collectors.toList());
//     Stream <Integer>s3= st.filter (e->e%2!=0 );
        int ll= st.filter (e->e%2!=0).mapToInt (Integer::intValue).sum ();
        System.out.println (ll );



    }
}
