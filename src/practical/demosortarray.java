package practical;

import java.util.Arrays;
import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class demosortarray {
    public static void main(String[] args) {
demosortarray sm= new demosortarray ();
sm.show ();
    }
    public void show(){
        int arr[]={5,1,22,11,44,66,33,77,8,9,2,0};
        Arrays.sort (arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println (arr[i] );
        }
        SortedSet st= new TreeSet ();
        for (int i = 0; i < arr.length; i++) {
            st.add (arr[i]);
        }
        System.out.println (st );
        Object [] arr1 = st.toArray ();
        for (int i = 0; i < arr.length; i++) {
            System.out.println (arr1[i]);
        }

    }
}
