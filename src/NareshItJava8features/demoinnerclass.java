package NareshItJava8features;

public class demoinnerclass {
    int a=10;
    static  int b=20;
    static class Innerclass{
        static  void show(){
            System.out.println ("outer class instance variable  :  "+new demoinnerclass().a );
            System.out.println ("outer class staic variable  :  "+b );
        }
        static {
            System.out.println ("inner class static block" );
        }
        Innerclass(){
            System.out.println ("inner class constructor" );
        }

        public static void main(String[] args) {
            new Innerclass ().show ();
        }
    }
    static {
        System.out.println ("outer class static block" );
    }
    demoinnerclass(){
        System.out.println ("outer class constructor " );
    }

    public static void main(String[] args) {


    }

}
