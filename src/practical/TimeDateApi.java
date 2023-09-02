package practical;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TimeDateApi {
    public static void main(String[] args) {
TimeDateApi td= new TimeDateApi ();
td.show ();
    }

    public void show(){
        // the timedateadi is final class  in java
        // that class we cant inherrited but  we can use thesout
        System.out.println (LocalDate.now ());
    }
}
