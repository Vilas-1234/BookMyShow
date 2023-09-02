package NareshITcollection;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class demoqueue {
    public static void main(String[] args) {
demoqueue dd= new demoqueue ();
dd.show ();
    }
    public void show(){

        Queue tt= new PriorityQueue ();
//        tt.offer ("vilas");
//        tt.add ("vilas");
//        tt.offer ("ashish");
//        tt.offer ("ashish");
//        tt.offer ("ganesh");
////        tt.offer ("ganesh");
//        tt.offer ("basvaraj");
//        tt.offer (null);
//        tt.offer (null);
        tt.offer (52);
        tt.offer (52);
        tt.offer (88);

        tt.offer (22);
        tt.offer (75);
        tt.offer (46);

        System.out.println (tt );
        //it is a not follow the insertion order...
        //it is follow the sorting order...
        //it was introduced in jdk 1.5 version...
        //it is allows the duplicate values...
        //in queue element are sorted in FIFO order...
        //queue  does not add anu null value
        System.out.println (tt.poll () );
        System.out.println (tt );

        System.out.println (tt.peek () );
        // we can use the peek method it will return the first element ...
        System.out.println (tt.size () );
//        System.out.println (tt.remove () );
        //if we can use remove method then it will return the first element into the
        // queue it will delete the permanentlly...
        System.out.println (tt.element ());

        System.out.println (tt);
    }
}
