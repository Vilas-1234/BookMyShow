package NareshITcollection;
import java.util.LinkedList;
import java.util.Queue;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.stream.Stream;

public class demoperiorityqueue {
    public static void main(String[] args) {
       demoperiorityqueue dpq= new demoperiorityqueue ();
dpq.show ();
    }
    public void show() {
        String  arr[] = {"vilas", "vishal","ram","sham","ganesh"};
        Queue pt = new PriorityQueue ( );

        for (int i = 0; i < arr.length; i++) {
            pt.offer (arr[i]);
        }
        System.out.println (pt);
        Stream <String >ab= pt.stream ();//type safty is very i
        ab.filter (s->s.length ()>5).forEach (s-> System.out.println (s ));
    }
}
