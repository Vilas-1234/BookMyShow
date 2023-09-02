package NareshItJava8features;

public class Lambdafunctiondemo {
    void show() {
        fun f = (s, y) -> System.out.println (s * y);
        f.show (10, 20);
        fun t;
    }

    public static void main(String[] args) {
        new Lambdafunctiondemo ().show ();
    }
}
interface  fun{
    void show(int t, int y);
}
