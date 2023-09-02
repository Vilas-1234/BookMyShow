package test;

import java.sql.SQLOutput;

public class JoinDemo {
    public static void main(String[] args) {
        try {
            Addmission ad = new Addmission ( );
            ad.start ( );

            Deposite dd= new Deposite ();
            dd.start ();
            rollNo rr= new rollNo ();
            rr.start ();
        }catch (Exception e)
        {
            System.out.println (e );
        }
    }
}
class Addmission extends Thread{

    public void run(){
        try{
            Addmission ad= new Addmission ();
            ad.start ();
            ad.join ();
            System.out.println ("start the Addmission..." );
            Thread.sleep (2000);
            System.out.println (" you have taken a addmission..." );
            Thread.sleep (2000);

        }catch (Exception e){
            System.out.println (e);
        }
    }
}
class Deposite extends  Thread{
    public void run(){
        try{
            Addmission ad= new Addmission ();
            ad.start ();
            ad.join ();
            System.out.println ("deposite fee..." );
            Thread.sleep (2000);
            System.out.println (" you have deposited the fee..." );
            Thread.sleep (2000);
        }catch (Exception e){
            System.out.println (e);
        }
    }

}
class rollNo extends Thread{
    public void run(){
        try{
            Addmission ad= new Addmission ();
            ad.start ();
            ad.join ();
            System.out.println ("  give roll no..." );
            Thread.sleep (2000);
            System.out.println (" Give the Exam...." );
            Thread.sleep (2000);

        }catch (Exception e){
            System.out.println (e);
        }

    }
}

