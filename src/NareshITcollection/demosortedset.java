package NareshITcollection;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.*;

public class demosortedset {
    public static void main(String[] args) {
demosortedset ss= new demosortedset ();
ss.show ();
        ss.sortt ();
    }
    void show() {
        SortedSet ss = new TreeSet ( );
        ss.add ("vilas");
        ss.add ("vikas");
        ss.add ("ram");
        ss.add ("rahul");
        ss.add ("vishal");
        ss.add ("ganesh");
        ss.add ("ashish");
        ss.add ("basvaraj");
        System.out.println (ss);
        System.out.println ( ss.subSet ("ashish","rahul") );
        // it is index based data structure ...
        // it does not follow the insertion order...
        // duplicate values are not allowed ...
        // null values are not allowed in to the sortedset...
        // it follow the sorting order...
        // we can add only homogenous data in to the sortedset...
        //it is non synchronized ...
        // it was introduced in jdk 1.2 version...
        System.out.println (ss.first ( ));
        //  the first method is return the first element  into the file...
        System.out.println (ss.headSet ("ram"));
        // it return the all before the elements will get the specified element ...
        System.out.println (ss.tailSet ("ganesh"));
        // it will return the all elements after the specified element
        System.out.println (ss.comparator ( ));
        Iterator it = ss.iterator ( );
        while (it.hasNext ( )) {
            System.out.println (it.next ( ));
        }
    }
        void sortt(){
           int arr[]={5,6,4,12,3,7,89,11,24,2,1};
           SortedSet st= new TreeSet ();
            for (int t:arr) {
                st.add (t);// if we add the array into the sorted set if we
            }
            System.out.println (st );
        }
}