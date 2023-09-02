package Exceptionhandlig;

public class abc {
    int  t;


    void show(){
        System.out.println ("i am parent method" );
        System.out.println (t );
    }

}
class shoo extends  abc{
    shoo(){

        System.out.println ("child constructor" );
    }
    void show(){
        System.out.println ("i am child method  " );
    }

    public static void main(String[] args) {
        shoo s= new shoo ();
     s.show ();
    }
}
