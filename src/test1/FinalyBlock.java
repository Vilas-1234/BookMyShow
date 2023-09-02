package test1;

public class FinalyBlock {
    public static void main(String[] args) {

        try{
            for (int i = 0; i < 10; i++) {

                System.out.println (10/0);
                System.gc ();
            }

        }catch (Exception e){
            e.printStackTrace ();
        }
        finally {
            System.out.println ("finally block is exicuted..." );
        }
    }
}
