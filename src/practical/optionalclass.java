package practical;

import java.util.Optional;

public class optionalclass {
    public static void main(String[] args) {
optionalclass op= new optionalclass ();
op.show ();
    }
    void show(){
        // there are three Optional class methods
        // Of(),empty();ofNullable();
        // all thre methods are static methods...
        String st[]= new String[5];
        st[2]="vilas manik pokarne";
        Optional <String> em= Optional.ofNullable (st[0]);
        if(em.isPresent ()){
            System.out.println ("is a data is present" );
        }else {
            System.out.println (" data is empty.." );
        }

        System.out.println (em );
        Optional <String> em1= Optional.of (st[2]);
        // it give the return value of the u specified object in to a constructor...
        System.out.println (em1);
    }
}
