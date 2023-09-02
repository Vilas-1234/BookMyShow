package practical;

import java.util.PriorityQueue;
import java.util.Queue;

public class vilas {
vilas(){
    System.out.println ("object is created" );
}
@Override
protected  void finalize(){
    System.out.println ("object delete" );
}
    public static void main(String[] args) {
    vilas vp= new vilas();
    vp=null;
    System.gc ();
        Queue e = new PriorityQueue ( );
e.add (10);
e.offer (20);
e.add (15);

        System.out.println (e );
        System.out.println (e.peek ());
        System.out.println (e.poll () );
        System.out.println (e );
        System.out.println (e.peek () );
    }
}

