package test;

public class withRunnable implements Runnable{
    @Override
    public void run() {
        try {
            vishal v= new vishal ();
            Thread tt= new Thread (v);
            tt.start ();
            tt.join ();
            for (int i = 0; i < 10; i++) {
                System.out.println ("vilas" + i);
            }
        }catch (Exception e){
            System.out.println (e);
        }
    }


    public static void main(String[] args)throws Exception {
        withRunnable rr= new withRunnable ();
        vishal v= new vishal ();
       Thread tt= new Thread (rr);
        Thread t= new Thread (v);
        t.start ();
//        tt.start ();
//        try {
//            for (int i = 0; i < 10; i++) {
//                System.out.println (Thread.currentThread ( ).getName ( ) + "  " + i);
//            }
//        }catch (Exception e){
//            System.out.println (e);
//        }
    }
}
class vishal implements Runnable{
    @Override
    public void run() {
        try {
            withRunnable w= new withRunnable ();
            Thread t= new Thread (w);
            t.start ();
            t.join ();
            for (int i = 0; i < 10; i++) {
                System.out.println ("vishal" + i);
            }
        }catch (Exception e){
            System.out.println (e);
        }
    }
}
