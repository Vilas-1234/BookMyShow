package NareshIT;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class vilasfileinputoutput {
    public static void main(String[] args)throws Exception {
vilasfileinputoutput vp = new vilasfileinputoutput ();
vp.show ();
vp.show1 ();
vp.show2 ();
    }
    void show() throws  Exception{
        File f= new File ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshIT\\rama.txt");
        f.createNewFile ();
        System.out.println ("Reading the data ..." );
        FileReader fr= new FileReader ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshIT\\rama.txt");
        System.out.println ( "connection created ..." );
        int i ;
        while((i=fr.read ())!=-1){
            System.out.print( (char)i);
        }
        System.out.println ( );
        System.out.println (" readding  is complete..." );
        fr.close ();

    }
    void show1() throws Exception{
        System.out.println ( "Writting the data..." );
        FileWriter fw= new FileWriter ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshIT\\rama.txt");
        System.out.println ("connection created..." );
        String s="ok i  am in pune... ";
        fw.write (s);
        System.out.println ("data is write ...." );
        fw.close ();

    }
    void show2()throws Exception{
        File ff= new File ("C:\\Users\\Lenovo\\IdeaProjects\\" +
                "corejava\\src\\NareshIT\\rama1.txt");
        FileReader fr= new FileReader ("C:\\Users\\Lenovo\\" +
                "IdeaProjects\\corejava\\src\\NareshIT\\rama.txt");
        FileWriter fw= new FileWriter ("C:\\Users\\Lenovo\\" +
                "IdeaProjects\\corejava\\src\\NareshIT\\rama1.txt",true);
        int i;
        int count=0;
        while ((i=fr.read ())!=-1){
            fw.write (i);
            count++;
        }
        System.out.println ("data copied" );
        System.out.println ("there are "+count +"charactor are present in that file.." );

        fr.close ();
        fw.close ();
    }

}
