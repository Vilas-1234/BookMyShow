package NareshItJava8features;

public class demodefaultmethod {
    public static void main(String[] args) {
//mega m=new mega ();
//m.show ();
star.sho2 ();
supe s= new supe ();
s.show1 ();
    }
} interface star {
    void show1();
    public static  void sho2(){
        System.out.println ("i am static method " );
    }
    public default void show() {
        System.out.println (" I am a default method" );
    }
}
abstract class mega implements star {
   public void show1(){
       System.out.println ("i am overridden method" );
    }
}
abstract class vinay implements star {

    void show12() {
        System.out.println ("vilas");
    }@Override
    public void show1() {
        star.super.show ( );
    }
}
class supe extends vinay{
    static void show123(){

    }

}