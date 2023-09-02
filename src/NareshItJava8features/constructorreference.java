package NareshItJava8features;

public class constructorreference {
    public static void main(String[] args) {
funny i=duggu::new;
i.meth1 ();
    }
}
@FunctionalInterface
interface funny {
    void meth1();
}
    class duggu{
        duggu(){
            System.out.println (" duggu class constructer" );
        }
    }