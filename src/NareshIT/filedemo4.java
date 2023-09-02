package NareshIT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class filedemo4 {
    public static void main(String[] args)throws Exception {
filedemo4 ff= new filedemo4 ();
ff.show ();
    }
    void show()throws Exception{
        File ff= new File ("naman.txt");
        ff.createNewFile ();
        FileInputStream fis= new FileInputStream ("C:\\Users\\Lenovo" +
                "\\IdeaProjects\\corejava\\naman.txt");
        int i;
        while ((i=fis.read ())!=-1){
            System.out.print ((char)i );
        }
    }
    void show1()throws Exception{
        FileOutputStream fos= new FileOutputStream ("C:\\Users\\Lenovo\\" +
                "IdeaProjects\\corejava\\naman.txt");
        String data="i am vilas patil \n i am from Nanded";
        byte[]arr=data.getBytes ();
        fos.write (arr);
        fos.close ();
    }
}
