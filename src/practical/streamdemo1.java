package practical;

import java.util.ArrayList;
import java.util.stream.Stream;

public class streamdemo1 {
    public static void main(String[] args) {
streamdemo1 sd= new streamdemo1 ();
sd.show ();
    }
    public void show(){
        ArrayList <Integer> vc =new<Integer> ArrayList<Integer> (  );
        vc.add (12);
        vc.add (14);
        vc.add (33);
        vc.add (21);
        vc.add (43);
        Stream st1=Stream .of (200,300,400,500,600,700);
        st1.forEach(e->System.out.println (e)) ;
    }
}
