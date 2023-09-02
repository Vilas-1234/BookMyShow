package NareshIT;

import java.io.File;
import java.io.FileInputStream;

public class filedemo3 {
    public static void main(String[] args)throws Exception {
filedemo3 ff= new filedemo3();
ff.read();
    }
    void read()throws Exception{
        File ff= new File ("vilas.txt");
        ff.createNewFile ();

        System.out.println("Reading the data from a file ");
        FileInputStream fis=new FileInputStream("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshI\\Tvilas.txt");
        System.out.println("Connection created");
        int i;
        while ((i=fis.read())!=-1){
            System.out.println((char)i);
        }
        System.out.println();
        System.out.println("Data reterived");
        fis.close();

    }

}
