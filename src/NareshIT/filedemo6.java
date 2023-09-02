package NareshIT;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class filedemo6 {
    public static void main(String[] args)throws Exception {
    filedemo6 fl= new filedemo6 ();
    //fl.show ();
    fl.show1 ();
    }
    void show()throws Exception {
        File f= new File ("xyz.text");
        f.createNewFile ();
        System.out.println ("read the data from a file ");
        FileReader fr = new FileReader ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\xyz.text");
        int i;
        fr.read ( );
        while ((i = fr.read ( )) != -1) {
            System.out.println ((char) i);
        }
        System.out.println ("data reterived");
        fr.close ( );
    }
    void show1()throws Exception{
        System.out.println ("write the data from a file " );
        FileWriter fw= new FileWriter ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\xyz.text",true);
        String str=", I am from Nanded";
        String st="But i am currently live in Pune";
        fw.write (str+st);
        fw.close ();
    }
    }
