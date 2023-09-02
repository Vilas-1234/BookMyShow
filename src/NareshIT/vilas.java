package NareshIT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class vilas {
    public static void main(String args[])throws Exception{
vilas vp = new vilas ();
//vp.show1 ();
//    vp.show ();
   vp.show2 ();
    }
    void show()throws Exception{
        System.out.println("Reading  the data from a file ");
        File ff= new File ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshIT\\raj.java");
        ff.createNewFile ();
        FileInputStream fis= new FileInputStream ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshIT\\raj.java");
        System.out.println ("Connnection created ");
        int i;
        while ((i=fis.read ())!=-1){
            System.out.print ((char)i );
        }
        System.out.println ();
        System.out.println ("Data is reterived");
        fis.close ();
    }
    void show1()throws Exception{
        System.out.println ("writing the data into the file" );
        FileOutputStream fos= new FileOutputStream ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshIT\\raj.java");
        System.out.println ("connection created" );
String data=" package NareshIT;\n" +
        "public class rani {\n" +
        "public static void main (String args[]){\n" +
        "int a=25;\n" +
        "int b=25;\n" +
        " System.out.println(a+b);\n" +
        "}\n" +
        "}";
byte []arr=data.getBytes ();
fos.write (arr);
        System.out.println ("data written" );
        fos.close ();
    }
    void show2()throws Exception{
        System.out.println ("copying the data from one file to another file" );
        File ff= new File ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshIT\\rani.java");
        ff.createNewFile ();
FileInputStream fis= new FileInputStream ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshIT\\raj.java");
FileOutputStream fos= new FileOutputStream ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshIT\\rani.java");
        System.out.println ("connection created" );
        int i;
        while((i=fis.read ())!=-1){
            fos.write (i);
        }
        System.out.println ("data copied" );
        fis.close ();
        fos.close ();

    }
}
