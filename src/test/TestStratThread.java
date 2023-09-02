package test;

public class TestStratThread  extends  Thread{
    @Override

    public void run(){
        TestStratThread.show ();
    }
    synchronized static void show(){
        for (int i = 0; i < 100; i++) {
            System.out.println ("vilas  "+ i );
            Thread.currentThread ( ).setName ("vilas.Thread");
            System.out.println (Thread.currentThread ( ).getName ( ));
        }
    }
    public static void main(String args[]) {
        TestStratThread tt = new TestStratThread ( );
        tt.start ( );
        try {
            for (int i = 0; i < 100; i++) {

                currentThread ( ).setName ("Ashish");
                System.out.println (currentThread ( ).getName ( ));
            }
        }catch (Exception e){
            System.out.println (e );
        }
    }
}
