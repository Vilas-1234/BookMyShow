package NareshItJava8features;

import java.time.*;
import java.util.Scanner;

public class demotime {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println ("enter the date" );
        int date=sc.nextInt ();
        System.out.println ("enter the month" );
        int month=sc.nextInt ();
        System.out.println ("enter the year" );
        int year=sc.nextInt ();
        LocalDate idl=LocalDate.of (year,month,date);
        LocalDate id2=LocalDate.now ();
        demotime.show (idl,id2);
        YearMonth y= YearMonth.now ();
        System.out.println (y );
    }
    public static void show(LocalDate dob,LocalDate todaydate){
        Period p=Period.between (dob,todaydate);
        System.out.println (p.getYears ()+"--"+p.getMonths ()+"--"+p.getDays () );
    }
}
