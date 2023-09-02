package NareshItJava8features;

import java.sql.SQLOutput;
import java.sql.Time;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;
import java.util.Timer;

public class Demodateapi {
    public static void main(String[] args) {
        Date d= new Date (  );
       Demodateapi dd= new Demodateapi ();
        dd.checkdate ();
//        SimpleDateFormat sdf=new SimpleDateFormat ( "dd/MM/yyyy" );
//        String date=sdf.format (d);
//        System.out.println (date );
//        SimpleDateFormat sd= new SimpleDateFormat ( "HH/mm/ss" );
//    String time=sd.format (d);
//        System.out.println (time );
}
    void checkdate (){
        LocalTime lt=LocalTime.now ();
        System.out.println (lt );
        System.out.println ("-----------" );
    LocalDate ld= LocalDate.now ();
        System.out.println (ld );
        System.out.println ("--------------" );
        String Date="12/11/1997";
        DateTimeFormatter ddd= DateTimeFormatter.ofPattern ("dd/MM/yyyy");
              LocalDate ll=LocalDate.parse (Date,ddd);
        System.out.println (ll );
        LocalDate  dd=LocalDate.now ();
        System.out.println (ld.minusDays (8));
        System.out.println ("--------------------------" );
LocalTime llt=LocalTime.now ();
DateTimeFormatter dtf=DateTimeFormatter.ofPattern ("HH/mm/ss");
String str=llt.format (dtf);
        System.out.println (str );
        System.out.println ("----------------------" );
        String  str1=dtf.format (llt);
        System.out.println (str );
        System.out.println ("----------------------------" );
//

        LocalTime  indiantime=LocalTime.now ();
        ZoneId x=ZoneId.of ("Asia/Dili");
        LocalTime aa= LocalTime.now (x);
        System.out.println ( aa);
        LocalTime americatime=LocalTime.now (x);
        long l= ChronoUnit.HOURS.between (indiantime,americatime);
        System.out.println (l );
//String arr[]= TimeZone.getAvailableIDs ();
//        for (String a:arr) {
//            System.out.println (a );
//        }
        Clock c=Clock.systemDefaultZone ();
        System.out.println (c );
Year y=Year.now ();
        System.out.println (y.atDay (316 ));


    }

}
