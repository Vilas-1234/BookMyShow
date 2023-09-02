import java.io.File;

public class filedemo5 {
    public static void main(String[] args) {
filedemo5 ff= new filedemo5 ();
ff.show ();
    }
    void show(){
        File ff= new File ("C:\\Users\\Lenovo");
               ff.list ();
        int count =0;
        for (String s1:ff.list ()) {
            count++;
            System.out.println (s1);
        }
        System.out.println (count );
    }
}
