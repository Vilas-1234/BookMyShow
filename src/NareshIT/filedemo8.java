package NareshIT;

import java.io.*;

public class filedemo8 {
    public static void main(String[] args) throws Exception{
filedemo8 f= new filedemo8 ();
f.show ();
f.show1 ();
    }
    void show()throws Exception{
        System.out.println (" read the data from a file " );
        FileInputStream fis= new FileInputStream ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshIT\\rama.txt");
        BufferedInputStream bis= new BufferedInputStream (fis);
        System.out.println (" connection is created " );
        int count =0;
                int i;
                while ((i=bis.read ())!=-1){
                    System.out.print((char)i );
                    count ++;
                }
                bis.close ();
        System.out.println ( );
        System.out.println (" reading is complete ....." );
        System.out.println ("there "+count+" charactor are present in that file ..." );
    }
    void show1()throws Exception{
        FileOutputStream fos= new FileOutputStream ("C:\\Users\\Lenovo\\IdeaProjects\\corejava\\src\\NareshIT\\rama.txt");
        BufferedOutputStream bos= new BufferedOutputStream (fos);
        System.out.println ("connection is created ....." );
        String str="i am a rider";
        byte arr[]=str.getBytes ();
        bos.write (arr);
        System.out.println ("write the data from a file..." );
        bos.close ();
    }

}
