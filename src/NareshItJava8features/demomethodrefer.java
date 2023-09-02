package NareshItJava8features;

public class demomethodrefer {
    void show(){
        vira v= new vira();
        INT t=v::show1;

       INT y= vira::new;
    }

    public static void main(String[] args) {
new demomethodrefer ().show ();
    }
}
class vira{
    vira(){
        System.out.println ("call constructor refer" );
    }
    static void s(){
        System.out.println ("call refer static method" );
    }
     void show1(){
        System.out.println (" call method referance..." );
    }
}
interface  INT{
    void show();
}
